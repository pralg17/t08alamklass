class Character(object):
    def __init__(self, x, y, name):
        self.x = x
        self.y = y
        self.name = name

    def moveLeft(self):
        self.x -= 5
        print(self.name, "has moved left 5 units")
        print("x: ", self.x, "y: ", self.y)

    def moveRight(self):
        self.x += 5
        print(self.name, "has moved right 5 units")
        print("x: ", self.x, "y: ", self.y)

    def moveUp(self):
        self.y += 5
        print(self.name, "has moved up 5 units")
        print("x: ", self.x, "y: ", self.y)

    def moveDown(self):
        self.y -= 5
        print(self.name, "has moved down 5 units")
        print("x: ", self.x, "y: ", self.y)