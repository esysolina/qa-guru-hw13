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

##Реализованные проверки
- ✓ Проверка заголовка страницы.
- ✓ Проверка меню "Услуги и продукты".
- ✓ Проверка меню "Вакансии".
- ✓ Проверка пункта меню "Блог".
- ✓ Проверка соответствия номера телефона.
- ✓ Проверка наличия ссылок социальных сетей.
- ✓ Проверка кнопки 'Сайт' на главной странице.

##Сборка в Jenkins
Ссылка на сборку
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

##Интеграция с Allure TestOps

##Интеграция с Jira

##Отчет в Telegram

##Видео примеры прохождения тестов