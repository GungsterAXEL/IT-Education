using Snake;

Console.SetWindowSize(92, 32);
Console.SetBufferSize(92, 32);

// Отрисовка рамки.
HorizontalLine upLine = new HorizontalLine(0, 90, 0, '+');
HorizontalLine downLine = new HorizontalLine(0, 90, 30, '+');
VerticalLine leftLine = new VerticalLine(0, 30, 0, '+');
VerticalLine rightLine = new VerticalLine(0, 30, 90, '+');
upLine.Drow();
downLine.Drow();
leftLine.Drow();
rightLine.Drow();

// Отрисовка точек.
Point p = new Point(4, 5, '*');
p.Draw();

Console.ReadLine();