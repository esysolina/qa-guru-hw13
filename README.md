#Проект по автоматизации тестрования сайта Litres
Веб сайт

##Содержание
- Технологии и инструменты
- Реализованные проверки
- Сборка в Jenkins
- Запуск из терминала
- Allure отчет
- Интеграция с Allure TestOps
- Интеграция с Jira
- Отчет в Telegram
- Видео примеры прохождения тестов

##Технологии и инструменты

##Реализованные проверки :shipit:
- ✓ Проверка поисковой строки.
- ✓ Проверка заголовка страницы.
- ✓ Проверка отсутствия ошибок в консоли.
- ✓ Проверка выдачи жанров в поиске.
- ✓ Проверка выдачи авторов по названию в поиске.

##Сборка в Jenkins
[Ссылка на сборку](http://www.screencapture.ru/file/988d6bd0)
###Параметры сборки в Jenkins:
- browser (браузер, по умолчанию chrome)
- browserVersion (версия браузера, по умолчанию 91.0)
- browserSize (размер окна браузера, по умолчанию 1920x1080)
- browserMobileView (название мобильного устройства, для примера iPhone X)
- remoteDriverUrl (логин, пароль и адрес удаленного сервера selenoid или grid)
- videoStorage (адрес, по которому можно получить видео)
- threads (количество потоков)

##Запуск из терминала
Локальный запуск:
>gradle clean test

Удаленный запуск:
>clean
test
-Dbrowser=${BROWSER}
-DbrowserVersion=${BROWSER_VERSION}
-DbrowserSize=${BROWSER_SIZE}
-DbrowserMobileView="${BROWSER_MOBILE}"
-DremoteDriverUrl=https://${LOGIN}:${PASSWORD}@${REMOTE_DRIVER_URL}/wd/hub/
-DvideoStorage=https://${REMOTE_DRIVER_URL}/video/
-Dthreads=${THREADS}

##Allure отчет
###Основной отчет
![Img1](http://www.screencapture.ru/file/7d5C7852)
###Тесты
![Img2](http://www.screencapture.ru/file/A6fac683)
###Графики
![Img3](http://www.screencapture.ru/file/1E4aE9Ab)
##Интеграция с Allure TestOps

##Интеграция с Jira

##Отчет в Telegram
![t](/images/telegram.jpg)
##Видео примеры прохождения тестов