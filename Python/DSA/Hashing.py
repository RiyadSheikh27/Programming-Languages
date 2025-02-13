hash_map = {}

def insert(hash_map, key, value):
    hash_map[key] = value
    print(f"Inserted: {key} -> {value}")

def get(hash_map, key):
    return hash_map.get(key, "Key not found")

def delete(hash_map, key):
    if key in hash_map:
        del hash_map[key]
        print(f"Deleted: {key}")
    else:
        print("Key not found")

def display(hash_map):
    for key, value in hash_map.items():
        print(f"{key}: {value}")

insert(hash_map, 'name', 'Alice')
insert(hash_map, 'age', 25)
insert(hash_map, 'city', 'New York')

print("Hash Map Contents:")
display(hash_map)

print(f"Retrieve 'name': {get(hash_map, 'name')}")
print(f"Retrieve 'job': {get(hash_map, 'job')}")

delete(hash_map, 'age')
print("Hash Map Contents after deletion:")
display(hash_map)
