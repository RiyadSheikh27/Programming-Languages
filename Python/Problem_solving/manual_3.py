from collections import defaultdict

# Define the graph class
class Graph:
    def __init__(self, vertices):
        self.graph = defaultdict(list)
        self.vertices = vertices

    # Function to add an edge to the graph
    def add_edge(self, u, v):
        self.graph[u].append(v)

    # Utility function to perform a depth-limited search
    def dls(self, src, target, limit):
        if src == target:
            return True
        if limit <= 0:
            return False
        for neighbor in self.graph[src]:
            if self.dls(neighbor, target, limit - 1):
                return True
        return False

    # Function to perform IDDFS
    def iddfs(self, src, target, max_depth):
        for depth in range(max_depth):
            if self.dls(src, target, depth):
                return True
        return False

# Function to read input from the user
def read_input():
    vertices = int(input("Enter the number of nodes in the graph: "))
    print("Enter the adjacency matrix:")
    adjacency_matrix = []
    for _ in range(vertices):
        row = input()
        adjacency_matrix.append([int(x) for x in row])
    src = int(input("Enter the source node: "))
    target = int(input("Enter the destination node: "))
    max_depth = int(input("Enter the maximum depth to search: "))
    return vertices, adjacency_matrix, src, target, max_depth

# Driver code to test the above functions
if __name__ == "__main__":
    vertices, adjacency_matrix, src, target, max_depth = read_input()
    
    g = Graph(vertices)
    for i in range(vertices):
        for j in range(vertices):
            if adjacency_matrix[i][j] == 1:
                g.add_edge(i, j)

    # Perform topological search using IDDFS
    found = g.iddfs(src, target, max_depth)

    if found:
        print(f"Path exists from node {src} to node {target} within depth {max_depth}.")
    else:
        print(f"No path exists from node {src} to node {target} within depth {max_depth}.")
