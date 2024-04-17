from collections import deque

def is_valid(x, y, grid):
    return 0 <= x < len(grid) and 0 <= y < len(grid[0]) and grid[x][y] != 0

def bfs(start, destination, grid):
    queue = deque([start])
    visited = set()
    parent = {}

    while queue:
        current = queue.popleft()
        x, y = current

        if current == destination:
            return construct_path(parent, start, destination)

        visited.add(current)

        directions = [(1, 0), (-1, 0), (0, 1), (0, -1)]
        moves = ['Moving Down', 'Moving Up', 'Moving Right', 'Moving Left']

        for idx, (dx, dy) in enumerate(directions):
            new_x, new_y = x + dx, y + dy

            if is_valid(new_x, new_y, grid) and (new_x, new_y) not in visited:
                queue.append((new_x, new_y))
                visited.add((new_x, new_y))
                parent[(new_x, new_y)] = (current, moves[idx])

    return None

def construct_path(parent, start, destination):
    path = []
    current = destination

    while current != start:
        path.append(parent[current])
        current = parent[current][0]

    path.reverse()
    return path

def print_path(path):
    print("Path from start to destination:")
    for move, point in path:
        print(f"{move} -> {point}")

def get_user_input():
    n, m = map(int, input("Enter the dimensions of the grid (rows columns): ").split())
    print("Enter the grid (use '0' for obstacles and '1' for empty cells):")
    grid = [list(map(int, input().strip().split())) for _ in range(n)]
    start = tuple(map(int, input("Enter the start point (row column): ").split()))
    destination = tuple(map(int, input("Enter the destination point (row column): ").split()))
    return grid, start, destination

def main():
    grid, start, destination = get_user_input()
    path = bfs(start, destination, grid)
    if path:
        print_path(path)
    else:
        print("No path found from start to destination.")

if __name__ == "__main__":
    main()
