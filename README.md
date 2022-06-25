# qa_java: финальный проект 2-го спринта курса Яндекс.Практикум 

Набор автоматизированных сценариев для тестирования программы по исследованию семейства кошачьих.
[qa_java: Miro Board](https://miro.com/app/board/uXjVO5ZkPIY=/)

## Содержимое проекта

Проект состоит из 2 основных частей.
1. Пакет src/main/java/com.example содержит классы программы для исследования семейства кошачьих.
2. Пакет src/test/java/com.example содержит тесты, подготовленные согласно [заданию тренажёра](https://practicum.yandex.ru/learn/qa-automation-engineer-java/courses/e20f1091-4e6d-484f-bffc-3797a0d436c6/sprints/16363/topics/b7347497-3e42-4b83-950b-c45b34191940/lessons/f422688c-33ce-4b52-b097-c32775f2e89d/)

### Сценарии тестирования

При подготовке проекта были применены стабирование и параметризация.
Тесты вида "ClassNameTest" - это стандартные тесты без параметризации, потенциально включающие в себя стабы.
Классы, проверка которых требует параметризации, были вынесены в отдельные тестовые классы вида "ClassNameMethodNameTest".
Для тестов был создан общий абстрактный родительский класс "BaseTestData", который содержит статические переменные с ожидаемым результатом, а также переменные, которые служат входными параметрами для дочерних тестовых классов. Переменные сгруппированы по классам, для тестирования которых они предназначены.

## Запуск автотестов

Ниже описан порядок подготовки локальной среды к запуску тестов.

### Пререквизиты

Подготовка локальной среды осуществляется согласно теме курса ["Локальная среда разработки"](https://practicum.yandex.ru/learn/qa-automation-engineer-java/courses/e2bf18c2-97c5-43f8-af20-80c52142e6f2/sprints/16356/topics/a1b6de5a-dd0d-418b-97ea-02258aa40b07/lessons/054c3a94-f4ee-46a4-8a5b-b5d373b9ada3/)
После подготовки локальной среды необходимо скачать проект, разместить его в локальном репозитории и запустить, например, используя IDE IntelliJ IDEA.

### Особенности запуска тестов

Запуск тестов возможен через встроенный в IDE функционал (требуется перейти в класс с тестом и нажать Ctrl+Shift+F10).
Запуск всех тестов возможен через консоль в директории проекта с помощью команды
    mvn test

## Автор

* **Артём Кот**

## Благодарности

При работе над проектом использовались материалы вебинаров:
* [Моки в unit-тестах](https://disk.yandex.ru/d/KzUNYF8aOuXaqw/10.02.2022%20-%20%D0%9C%D0%BE%D0%BA%D0%B8%20%D0%B2%20unit-%D1%82%D0%B5%D1%81%D1%82%D0%B0%D1%85)
* [Вебинар по разбору проекта](https://disk.yandex.ru/d/XFbCTppSwjhQVQ)

Отдельное спасибо команде наставников в Slack, объяснивших нюансы создания мокированных тестов с параметризацией и давших ряд полезных советов по архитектуре проекта.
