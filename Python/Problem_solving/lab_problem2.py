def is_valid(x, y, grid):
    return 0 <= x < len(grid) and 0 <= y < len(grid[0]) and grid[x][y] != 0

def dfs(start, destination, grid, visited, moves):
    x, y = start

    if start == destination:
        return True

    visited.add(start)

    directions = [(1, 0), (0, 1)]
    moves_desc = ['Moving Down', 'Moving Right']

    for idx, (dx, dy) in enumerate(directions):
        new_x, new_y = x + dx, y + dy

        if is_valid(new_x, new_y, grid) and (new_x, new_y) not in visited:
            moves.append(moves_desc[idx] + f" ({new_x}, {new_y})")
            if dfs((new_x, new_y), destination, grid, visited, moves):
                return True

    return False

def find_topological_order(start, destination, grid):
    visited = set()
    moves = []

    if dfs(start, destination, grid, visited, moves):
        moves.append("Goal found")
        num_moves = len(moves) - 1 
        print("\n".join(moves))
        print("Number of moves required =", num_moves)
    else:
        print("No path found from start to destination.")

def get_user_input():
    n, m = map(int, input("Enter the dimensions of the grid (rows columns): ").split())
    print("Enter the grid (use '0' for obstacles and '1' for empty cells):")
    grid = [list(map(int, input().strip().split())) for _ in range(n)]
    start = tuple(map(int, input("Enter the start point (row column): ").split()))
    destination = tuple(map(int, input("Enter the destination point (row column): ").split()))
    return grid, start, destination

def main():
    grid, start, destination = get_user_input()
    find_topological_order(start, destination, grid)

if __name__ == "__main__":
    main()
