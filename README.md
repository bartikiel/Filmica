# Filmica

**Opis:** Aplikacja do obsługi małego, lokalnego kina.

**Typ projektu:** projekt studencki 

**Przedmiot:** Metodologia tworzenia projektów informatycznych

**Uczelnia:** Wyższa Szkoła Ekonomiczna w Białymstoku

**Drużyna:** Karolina Czochańska, Łukasz Zubrzycki, Bartosz Kiełczewski

## Podstawowe informacje

### Podstawowe wymagania
1. Aplikacja będzie posiadać dwa typy użytkowników: user (klient kina) i admin (osoba zarządzająca kinem).
2. Kino działa tylko w jednym mieście.
3. Kino posiada 3 sale: małą salę (do 10 osób), średnią salę (do 20 osób) i dużą salę (do 50 osób).
4. Kino posiada jednolita politykę cenową. Pojedynczy bilet kosztuje zawsze 15 zł.
5. User powinien móc: przeglądać repertuar, mieć wgląd w informacje dotyczące danego filmu, kupić bilet na określony seans.
6. Admin powinien móc: zalogować się jako administrator, ustalać repertuar, dodawać nowe filmy, usuwać filmy, edytować filmy.
7. Każdy film powinien mieć następujące cechy: tytuł, czas trwania, obsada, rodzaj, kategoria wiekowa (wiek oglądającego).

### Słownik używanych pojęć
**User** - klient kina

**Admin** - osoba zarządzająca kinem, administrator

**Lista filmów** - lista wszystkich filmów dostępnych w kinie z informacją, który jest aktualnie dostępny w repertuarze

**Repertuar** - lista aktualnie wyświetlanych filmów na dany dzień bądź tydzień z podziałem na salę

**Film** - utwór zawierający następujące informacje: plik z filmem, tytuł, czas trwania, obsada, rodzaj, kategoria wiekowa 

**Zarezerwować/kupić bilet** - proces podczas którego użytkownik wybiera seans (i miejsce w sali) z dostępnego repertuaru na dany dzień

### Przypadki użycia
**Jako admin chcę móc:**
- zalogować się (przełączyć się na tryb administratora)
- wyświetlać listę filmów
- dodawać nowe filmy
- usuwać filmy
- edytować filmy
- wyświetlać repertuar (listę filmów aktualnie wyświetlanych z podziałem na salę i informacją ile miejsc zostało zajętych)
- dodawać filmy do repertuaru na dany dzień
- usuwać filmy z repertuaru
- edytować repertuar
- sprawdzać ile biletów zostało kupionych w danym dniu, na dany seans, w której sali

**Jako user chcę móc:**
- wyświetlać repertuar
- wyświetlać informację o wybranym filmie
- zarezerwować bilet na dany seans

### Wybrane technologie

####Java 
Filmica zostanie wykonana w języku programowania Java, jako aplikacja konsolowa (bez graficznego interfejsu użytkownika). 

####Gitlab
Do zarządzania kodem projektu oraz śledzenia historii zmian będziemy wykorzystywali platformę Gitlab. 

####IDE
Jako środowisko programistyczne wybraliśmy IntelliJ IDEA Community Edition.

## Uruchamianie aplikacji do celów developerskich
1. Aplikacja została założona jako projekt prywatny, więc należy ubiegać się u właściciela projektu bądź członków drużyny o dostęp do repozytorium.
2. Sklonuj repozytorium ze strona projektu na Gitlabie: https://gitlab.com/informatyka-stosowana/filmica
3. Uruchom projekt w IDE

## Przydatne linki
- Gitlab: https://gitlab.com/ 
- Git: https://git-scm.com/ 
- Java: https://www.java.com/pl/ 
- IntelliJ: https://www.jetbrains.com/idea/ 
- Gitignore generator: https://www.toptal.com/developers/gitignore 
- Gitatributes generator: https://gitattributes.io/ 
- Editorconfig generator: https://editorconfig.org/ 
- Readme generator: https://www.makeareadme.com/ 

## Licencja
[MIT](https://choosealicense.com/licenses/mit/)