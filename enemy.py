from character import Character


class Enemy(Character):

    def __init__(self, x, y, damage):
        super(Enemy, self).__init__(x, y, 'Enemy')
        self.damage = damage

    def attack(self, target):
        target.getHit(self.damage)
