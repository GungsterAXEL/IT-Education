from User_Interface import temperature_view
from User_Interface import pressure_view
from User_Interface import wind_speed_view


def create(device=1):
    xml_name = '.\GeekBrains\Digital Master 07.08.2022г\Первая четверть\Блок 2\Знакомство с языком Python\Examples\Lection_04\Sensor_Result\Data.xml'
    xml = '<xml>\n'
    xml += '   <temperature units = "c">{}</temperature>\n'\
        .format(temperature_view(device))
    xml += '   <pressure units = "mmHg">{}</pressure>\n'\
        .format(pressure_view(device))
    xml += '   <wind_speed units = "m/s">{}</wind_speed>\n'\
        .format(wind_speed_view(device))
    xml += '</xml>'

    with open(xml_name, 'w') as page:
        page.write(xml)

    return xml


def new_create(data, device=1):
    t, p, w = data
    t = t * 1.8 + 32
    xml_name = '.\GeekBrains\Digital Master 07.08.2022г\Первая четверть\Блок 2\Знакомство с языком Python\Examples\Lection_04\Sensor_Result\\New_Data.xml'
    xml = '<xml>\n'
    xml += '   <temperature units = "f">{}</temperature>\n'\
        .format(t)
    xml += '   <pressure units = "mmHg">{}</pressure>\n'\
        .format(p)
    xml += '   <wind_speed units = "m/s">{}</wind_speed>\n'\
        .format(w)
    xml += '</xml>'

    with open(xml_name, 'w') as page:
        page.write(xml)

    return data