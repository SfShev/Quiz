package com.example.quiz;

import java.util.ArrayList;
import java.util.List;

public class QuestionsBank {

    private static List<QuestionsList> filmQuestions(){

        final List<QuestionsList> questionsList = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("Что на самом деле представляет из себя легендарный зеленый код из «Матрицы»?",
                "Рецепт суши",
                "Рецепт пельменей",
                "Рецепт жаркого",
                "Рецепт Пад Тая",
                "Рецепт суши",
                "");
        final QuestionsList question2 = new QuestionsList("Кто на самом деле рисовал Розу в «Титанике»?",
                "Леонардо ДиКаприо",
                "Билли Зейн",
                "Джеймс Кэмерон",
                "Кэти Бейтс",
                "Джеймс Кэмерон",
                "");
        final QuestionsList question3 = new QuestionsList("Где снимали трилогию «Властелин колец»?",
                "В Ирландии",
                "В Исландии",
                "В Новой Зеландии",
                "В Австралии",
                "В Новой Зеландии",
                "");
        final QuestionsList question4 = new QuestionsList("В какую страну отправился Форрест Гамп в составе сборной США по настольному теннису?",
                "Во Вьетнам",
                "В Китай",
                "В Швецию",
                "Во Францию",
                "В Китай",
                "");
        final QuestionsList question5 = new QuestionsList("Какого цвета полосатый свитер Фредди Крюгера?",
                "Красно-синего",
                "Оранжево-зеленого",
                "Красно-зеленого",
                "Оранжево-коричневого",
                "Красно-зеленого",
                "");
        final QuestionsList question6 = new QuestionsList("Какой актер не играл Джокера?",
                "Джек Николсон",
                "Шон Пенн",
                "Джаред Лето",
                "Марк Хэмилл",
                "Шон Пенн",
                "");
        final QuestionsList question7 = new QuestionsList("Сколько оставалось жить тем, кто смотрел проклятую видеокассету в «Звонке»?",
                "3 дня",
                "7 дней",
                "5 дней",
                "1 день",
                "7 дней",
                "");
        final QuestionsList question8 = new QuestionsList("Какой фильм — самый кассовый в истории кино?",
                "«Титаник»",
                "«Аватар»",
                "«Мстители: Финал»",
                "«Звездные войны: Пробуждение силы»",
                "«Аватар»",
                "");
        final QuestionsList question9 = new QuestionsList("Какой комик появился в качестве зомби в «Добро пожаловать в Zомбилэнд»?",
                "Дэн Эйкройд",
                "Чеви Чейз",
                "Стив Мартин",
                "Билл Мюррей",
                "Билл Мюррей",
                "");
        final QuestionsList question10 = new QuestionsList("Экзамен по какому предмету сдавали студенты в фильме «Операция «Ы» и другие приключения Шурика»?",
                "Математика",
                "Физика",
                "Химия",
                "История",
                "Физика",
                "");



        questionsList.add(question1);
        questionsList.add(question2);
        questionsList.add(question3);
        questionsList.add(question4);
        questionsList.add(question5);
        questionsList.add(question6);
        questionsList.add(question7);
        questionsList.add(question8);
        questionsList.add(question9);
        questionsList.add(question10);
        return questionsList;
    }

    private static List<QuestionsList> multQuestions(){

        final List<QuestionsList> questionsList = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("У персонажей из этого мультсериала Уолта Диснея всегда была под рукой «Энциклопедия юных сурков».",
                "«Мишки Гамми»",
                "«Чип и Дэйл спешат на помощь»",
                "«Утиные истории»",
                "«Микки Маус»",
                "«Утиные истории»",
                "");
        final QuestionsList question2 = new QuestionsList("Назовите имя хищника семейства кошачьих, защитника Жасмин из мультсказки «Аладдин».",
                "Абдула",
                "Раджа",
                "Сэм",
                "Абу",
                "Раджа",
                "");
        final QuestionsList question3 = new QuestionsList("Особо известный вид гонок, в которых принимали участие персонажи мульт-истории «Тачки 2».",
                "Ралли Париж-Дакар",
                "Наскар",
                "Мировое Гран-При",
                "24 часа Ле-Мана",
                "Мировое Гран-При",
                "");
        final QuestionsList question4 = new QuestionsList("Шэрхан в мультике про Маугли был?",
                "Питоном",
                "Добрым медведем",
                "Тигром-людоедом",
                "Шакалом",
                "Тигром-людоедом",
                "");
        final QuestionsList question5 = new QuestionsList("Друг и советчик Пиноккио.",
                "Мотылек",
                "Сверчок",
                "Стрекоза",
                "Червяк",
                "Сверчок",
                "");
        final QuestionsList question6 = new QuestionsList("Имя главного героя из мультика «Король Лев».",
                "Муфаса",
                "Симба",
                "Нола",
                "Тимон",
                "Симба",
                "");
        final QuestionsList question7 = new QuestionsList("Дуэтом с черепахой песенку «Я на солнышке лежу…» пел?",
                "Львенок",
                "Лягушонок",
                "Котенок",
                "Воробушек",
                "Львенок",
                "");
        final QuestionsList question8 = new QuestionsList("Какой предмет, «словно галку», съел крокодил в мультике «Мойдодыр»?",
                "Полотенце",
                "Мочалку",
                "Щетку",
                "Мыло",
                "Мочалку",
                "");
        final QuestionsList question9 = new QuestionsList("Имя кота из мультика «Простоквашино».",
                "Барсик",
                "Рыжик",
                "Матроскин",
                "Шарик",
                "Матроскин",
                "");
        final QuestionsList question10 = new QuestionsList("Какую вкуснятину пытались поделить котенок Гав и щенок?",
                "Сосиску",
                "Леденец",
                "Косточку",
                "Мороженое",
                "Сосиску",
                "");



        questionsList.add(question1);
        questionsList.add(question2);
        questionsList.add(question3);
        questionsList.add(question4);
        questionsList.add(question5);
        questionsList.add(question6);
        questionsList.add(question7);
        questionsList.add(question8);
        questionsList.add(question9);
        questionsList.add(question10);
        return questionsList;
    }

    private static List<QuestionsList> animeQuestions(){

        final List<QuestionsList> questionsList = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("В какой стране появился и получил своё развитие жанр аниме?",
                "Вьетнам",
                "Китай",
                "Япония",
                "США",
                "Япония",
                "");
        final QuestionsList question2 = new QuestionsList("Единственный в мире мультфильм получил премию Британского кинофестиваля в номинации лучший фильм, а не лучший мультфильм.Как он называется?",
                "Евангелион",
                "Унесенные призраками",
                "Принцесса Мононоке",
                "Стальной алхимик",
                "Унесенные призраками",
                "");
        final QuestionsList question3 = new QuestionsList("Что такое манга",
                "Девушка в аниме",
                "Национальный японский костюм",
                "Комиксы, по которым снимают аниме",
                "Рассказ о детстве героев",
                "Комиксы, по которым снимают аниме",
                "");
        final QuestionsList question4 = new QuestionsList("Как называют фанатов аниме и манги?",
                "Наруто",
                "Додзинси",
                "Бурито",
                "Отаку",
                "Отаку",
                "");
        final QuestionsList question5 = new QuestionsList("Как называется жанр аниме с активным участием боевых роботов?",
                "Киберпанк",
                "Меха",
                "Гига",
                "Моэ",
                "Меха",
                "");
        final QuestionsList question6 = new QuestionsList("Назовите аниме-сериал, известный многим советским детям.",
                "Наруто",
                "Приключения пчёлки Майи",
                "Стальной алхимик",
                "Сейлор Мун",
                "Приключения пчёлки Майи",
                "");
        final QuestionsList question7 = new QuestionsList("В каком аниме-фильме был использован образ русской избушки на курьих ножках?",
                "Унесенные призраками",
                "Ветер крепчает",
                "Ходячий замок",
                "Тетрадь смерти",
                "Ходячий замок",
                "");
        final QuestionsList question8 = new QuestionsList("Назовите самый длинный аниме-сериал за всю историю.",
                "Наруто",
                "Покемон",
                "Сейлор Мун",
                "Садзаэ-Сан",
                "Садзаэ-Сан",
                "");
        final QuestionsList question9 = new QuestionsList("Какой герой S-класса из аниме «Ванпанчмен» в действительности не обладает никакой силой?",
                "Бофой",
                "Бэнг",
                "Кинг",
                "Джонин",
                "Кинг",
                "");
        final QuestionsList question10 = new QuestionsList("Какого цвета был Сусано Мадары Учихи?",
                "Синий",
                "Красный",
                "Фиолетовый",
                "Зеленый",
                "Синий",
                "");



        questionsList.add(question1);
        questionsList.add(question2);
        questionsList.add(question3);
        questionsList.add(question4);
        questionsList.add(question5);
        questionsList.add(question6);
        questionsList.add(question7);
        questionsList.add(question8);
        questionsList.add(question9);
        questionsList.add(question10);
        return questionsList;
    }

    private static List<QuestionsList> serialQuestions(){

        final List<QuestionsList> questionsList = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("Какой предмет Уолтер Уайт преподавал в школе?",
                "Математика",
                "История",
                "Физика",
                "Химия",
                "Химия",
                "");
        final QuestionsList question2 = new QuestionsList("Как Яковлев называл Гришу Измайлова в сериале «Полицейский с Рублевки»?",
                "Демон",
                "Дьявол",
                "Черт",
                "Бес",
                "Демон",
                "");
        final QuestionsList question3 = new QuestionsList("События Южного парка происходят в каком штате?",
                "Колорадо",
                "Калифорния",
                "Огайо",
                "Ойдахо",
                "Колорадо",
                "");
        final QuestionsList question4 = new QuestionsList("Где проходил армейскую службу Саша Белый?",
                "Афганистан",
                "Осетия",
                "Грузия",
                "Германия",
                "Афганистан",
                "");
        final QuestionsList question5 = new QuestionsList("«Левин, ты не врач, ты олень!» Кто сказал в «Интернах»?",
                "Быков",
                "Лобанов",
                "Романенко",
                "Кисегач",
                "Лобанов",
                "");
        final QuestionsList question6 = new QuestionsList("Как зовут лютоволка Джона Сноу?",
                "Призрак",
                "Леди",
                "Лето",
                "Серый Ветер",
                "Призрак",
                "");
        final QuestionsList question7 = new QuestionsList("Какое полное имя главного героя сериала «Менталист»?",
                "Патрик Джейн",
                "Шерлок Холмс",
                "Питтер Кейн",
                "Джон Пейн",
                "Патрик Джейн",
                "");
        final QuestionsList question8 = new QuestionsList("Как называли главного отрицательного героя сериала, которого сыграл Лев Борисов?",
                "Анаболик",
                "Антибиотик",
                "Прибиотик",
                "Аминокислотник",
                "Антибиотик",
                "");
        final QuestionsList question9 = new QuestionsList("Как называется российская адаптация американского сериала «CSI: Место преступления Нью-Йорк»?",
                "Морские дьяволы",
                "Старая гвардия",
                "След",
                "Меч",
                "След",
                "");
        final QuestionsList question10 = new QuestionsList("На какой машине ездит Фома из сериала «Физрук»?",
                "Кабриолет",
                "Гелендваген",
                "Аутлендер",
                "ГрандЧероки",
                "Гелендваген",
                "");



        questionsList.add(question1);
        questionsList.add(question2);
        questionsList.add(question3);
        questionsList.add(question4);
        questionsList.add(question5);
        questionsList.add(question6);
        questionsList.add(question7);
        questionsList.add(question8);
        questionsList.add(question9);
        questionsList.add(question10);
        return questionsList;
    }

    public static List<QuestionsList> qetQuestions (String selectedTopicName){
        switch (selectedTopicName){
            case "film": return filmQuestions();
            case "mult": return multQuestions();
            case "anime": return animeQuestions();
            default: return serialQuestions();
        }
    }
}
