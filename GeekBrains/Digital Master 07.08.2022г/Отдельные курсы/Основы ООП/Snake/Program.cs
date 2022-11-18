using Snake;

Console.Clear();

Point p1 = new Point(1, 3, '*');
p1.Draw();

Point p2 = new Point(4, 5, '#');
p2.Draw();

HorizontalLine line = new HorizontalLine(5, 10, 8, '+');
line.Drow();

VerticalLine line2 = new VerticalLine(8, 13, 10, '+');
line2.Drow();

Console.ReadLine();