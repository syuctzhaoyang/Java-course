class Geese:
    __neck = "脖子较长"
    wing = "振翅频率高"
    leg = "行走自如"
    __width = -5
    def __init__(self,name):
        self.name = name
        # print(self.name)
        # print('这是我的构造方法')

    def getName(self):
        print(self.name)

    def getNeck(self):
        print(self.__neck)

    def fly(self, state='我会飞'):
        print(state)
class Rect:
    def __init__(self, width, height):
        self.__width = width
        self.__height = height
    def area(self):
        return self.__width * self.__height
#
# if __name__ == "__main__":
#     goose1 = Geese('hello')
#     goose1.fly()
