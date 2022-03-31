# Проект по автоматизации тестрования сайта Litres
[Веб сайт](https://www.litres.ru/)

## :open_file_folder: Содержание
- Технологии и инструменты
- Реализованные проверки
- Сборка в Jenkins
- Запуск из терминала
- Allure отчет
- Интеграция с Allure TestOps
- Интеграция с Jira
- Отчет в Telegram
- Видео примеры прохождения тестов

## :rocket: Технологии и инструменты
<p align="center">
<a href="https://www.jetbrains.com/idea/"><img src="/images/Intelij_IDEA.svg" width="50" height="50"  alt="IDEA"/></a>
<a href="https://www.java.com/"><img src="/images/Java.svg" width="50" height="50"  alt="Java"/></a>
<a href="https://github.com/"><img src="/images/Github.svg" width="50" height="50"  alt="Github"/></a>
<a href="https://junit.org/junit5/"><img src="/images/JUnit5.svg" width="50" height="50"  alt="JUnit 5"/></a>
<a href="https://gradle.org/"><img src="/images/Gradle.svg" width="50" height="50"  alt="Gradle"/></a>
<a href="https://selenide.org/"><img src="/images/Selenide.svg" width="50" height="50"  alt="Selenide"/></a>
<a href="https://aerokube.com/selenoid/"><img src="/images/Selenoid.svg" width="50" height="50"  alt="Selenoid"/></a>
<a href="https://github.com/allure-framework/allure2"><img src="/images/Allure_EE.svg" width="50" height="50"  alt="Allure"/></a>
<a href="https://www.jenkins.io/"><img src="/images/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a>
</p>

## :white_check_mark: Реализованные проверки
- ✓ Проверка поисковой строки.
- ✓ Проверка заголовка страницы.
- ✓ Проверка отсутствия ошибок в консоли.
- ✓ Проверка выдачи жанров в поиске.
- ✓ Проверка выдачи авторов по названию в поиске.

## :chart_with_downwards_trend: Сборка в Jenkins
[Ссылка на сборку](https://jenkins.autotests.cloud/job/qa-quru-esysolina-13/5/)
### Параметры сборки в Jenkins:
- browser (браузер, по умолчанию chrome)
- browserVersion (версия браузера, по умолчанию 91.0)
- browserSize (размер окна браузера, по умолчанию 1920x1080)
- browserMobileView (название мобильного устройства, для примера iPhone X)
- remoteDriverUrl (логин, пароль и адрес удаленного сервера selenoid или grid)
- videoStorage (адрес, по которому можно получить видео)
- threads (количество потоков)

## :gear: Запуск из терминала
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

## :bar_chart: Allure отчет
### Основной отчет
![Img1](/images/mainreport.jpg)
### Тесты
![Img2](/images/tests.jpg)
### Графики
![Img3](/images/graph.jpg)
## :page_with_curl: Интеграция с Allure TestOps
### Дашборды
![Img4](/images/ato_dash.jpg)
### Тест-кейсы
![Img5](/images/ato_cases.jpg)
## :pencil2: Интеграция с Jira
![Img6](/images/jira.jpg)
## :love_letter: Отчет в Telegram
![t](/images/telegram.jpg)

## :clapper: Видео пример прохождения тестов
<p align="center">
<img title="Selenoid Video" src="/images/video1.gif" width="250" height="153"  alt="video">
</p>