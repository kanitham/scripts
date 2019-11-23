class Point:
    def __init__(self, arg1, arg2):
        self.X = arg1
        self.Y = arg2
    def getPoint(self):
        return self.X,self.Y
class Line:
    def __init__(self, p1, p2):
        self.P1=p1
        self.P2=p2
        if p1.X == p2.X:
            self.slope =  "infinity"
        else:
            self.slope = format((p2.Y -
                p1.Y)/(p2.X-p1.X),'.2f')

    def showLine(self):
        print("Line with slope "+ str(self.slope)  + " connecting P1"
            + str(self.P1.getPoint()) + " and P2" + str(self.P2.getPoint()))

#a = Point(10,-20)
#b = Point(-3,0)

#l = Line(a,b)
#l.showLine()

class Collection:
    def __init__collection(self):
        print("init")
        self.col = [-2,-1,0,1,2,-3,1,4,-4,2,0,-3,10,-20,-3,0]
        self.lines = []
        for p1 in col:
            for p2 in col:
                if p1 is not p2 :
                    lines.add(Point(p1,p2))
        print(lines)

    def printBeautifulLines(self):
        print(lines)
        for line in self.lines:
            line.showLine()
            if line.slope == 1 :
                line.showLine()
a=Collection()
a.printBeautifulLines()
