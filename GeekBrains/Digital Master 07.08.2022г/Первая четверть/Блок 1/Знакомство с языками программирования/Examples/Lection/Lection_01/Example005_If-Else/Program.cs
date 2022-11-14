Console.Write("Введите ваше имя: ");
string username = Console.ReadLine();

if(username.ToLower() == "маринка")
{
    Console.WriteLine("Ура, этоже Маринка!");
}
else
{
Console.Write("Привет, ");
Console.WriteLine(username);
}