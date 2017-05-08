from character import Character


class Player(Character):

    def __init__(self, x, y, health):
        super(Player, self).__init__(x, y, 'Player')
        self.health = health
        self.dead = False

    def getHit(self, damage):
        self.health -= damage
        print("player got hit for", damage, "damage!")
        print("player health:", self.health)
        if self.health <= 0:
            print("player has died")
            self.dead = True