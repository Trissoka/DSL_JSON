# ReadMe pour DSL
#### Par Julie AYOUBI, Tristan CHARVIN et Tom ROY
***
Dans ce git vous trouverez notre DSL, nommé avec beaucoup d'inspiration "newDsl".

Dans l'état actuel, notre DSL est capable de:
- lire un .json donné en paramètre de la façon suivante : read("path.json")
- montrer le dernier .json lu avec : show()
- ecrire un .csv en spécifiant le chemin et en fournissant un JSON en paramètre : writeCSV("Path.csv",{Var1 = "Foo",Var2 = 1})
- ecrire un .csv le dernier .json lu et en spécifiant le chemin : write CSV("Path.csv")
- ecrire un .json en spécifiant le chemin et en fournissant un JSON en paramètre : writeJSON("Path.json,{Var1 = "Foo",Var2 = 1})

Vous trouverez dans le dossier :

```
newDSL/org.xtext.example.mydsl.tests/src/org/xtext/example/mydsl/tests
```
Les deux compilateurs (Python et JQ) ainsi que le ParserXtend qui a permit de réaliser les différents tests.

## Example code newDSL
```
read("./my_json")
show()

writeCSV("./my_json_to_csv.csv")


writeJSON("./my_new_json.json",{Var1 = "Foo", Var2 = 0, Var3 = "FooFoo"})
writeCSV("./my_new_json.csv",{Var1 = "Foo", Var2 = 0, Var3 = "FooFoo"})
```