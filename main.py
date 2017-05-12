from player import Player
from enemy import Enemy


class Main(object):

    def __init__(self):
        self.player = Player(50, 70, 100)
        self.enemy = Enemy(70, 70, 50)
        self.running = True
        self.timer = 0
        while self.running:
            self.update()

    def update(self):
        
        if self.player.x != self.enemy.x:
            self.player.moveRight()
            self.enemy.moveLeft()
        else:
            self.enemy.attack(self.player)
        if self.player.dead:
            self.running = False
            print("game over!")

if __name__ == '__main__':
    Main()

"""
Player has moved right 5 units
x:  55 y:  70
Enemy has moved left 5 units
x:  65 y:  70
Player has moved right 5 units
x:  60 y:  70
Enemy has moved left 5 units
x:  60 y:  70
player got hit for 50 damage!
player health: 50
player got hit for 50 damage!
player health: 0
player has died
game over!

Process finished with exit code 0
"""
