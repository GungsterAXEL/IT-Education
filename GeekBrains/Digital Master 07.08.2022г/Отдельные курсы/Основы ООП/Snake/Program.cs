using Snake;
using System.Drawing;

Console.Clear();

Point p1 = new Point(1, 3, '*');
p1.Draw();

Point p2 = new Point(4, 5, '#');
p2.Draw();

List<int> numList = new List<int>();
numList.Add(1);
numList.Add(2);
numList.Add(3);

int x = numList[0],
    y = numList[1],
    z = numList[2];

foreach (int i in numList)
{
    Console.WriteLine(i);
}

numList.RemoveAt(0);

foreach (int i in numList)
{
    Console.WriteLine(i);
}

List<Point> plist = new List<Point>();
plist.Add(p1);
plist.Add(p2);

Console.ReadLine();