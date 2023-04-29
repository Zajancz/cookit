package com.example.cocktails;

public class Cocktail {
    private String name;
    private String recipe;

    public Cocktail(String name, String recipe) {
        this.name = name;
        this.recipe = recipe;
    }

    public static final Cocktail[] cocktails = {
            new Cocktail("Bloody Mary", "Składniki:\n 40 ml wódki\n 10 ml soku z cytryny\n 120 ml soku pomidorowego\n sos worchestershire\n sól " +
                    "\n pieprz\n tabasco\n gałązka selera naciowego \n" +
                    "\n Sposób przygotowania: " +
                    "\n Wszystkie składniki wymieszać w szklance z lodem i ozdobić selerem naciowym."),

            new Cocktail("Red Beach", "Składnik:\n 122 ml piwa\n 10 ml wody z cytryny\n 120 ml wódki pomidorowej\n sos worchestershire\n cukier " +
                    "\n Sposób przygotowania: " +
                    "\n Wszystkie składniki wymieszać w sklance z lodem i ozdobić selerem naciowym.")

    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }
}
