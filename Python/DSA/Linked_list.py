class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


node1 = Node(10)
node2 = Node(20)
node3 = Node(30)
node4 = Node(40)

node1.next = node2
node2.next = node3
node3.next = node4

current_node = node1
while current_node != None:
    print(current_node.data, end="->")
    current_node = current_node.next

print("None")
