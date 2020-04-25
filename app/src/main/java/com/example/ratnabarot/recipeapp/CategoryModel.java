package com.example.ratnabarot.recipeapp;

public class CategoryModel {

    private String recipeName;

    private String recipeDescription;

    private String documentId;

    private int numLike;


    private CategoryModel() {}

    private CategoryModel(String recipeName, String recipeDescription, String documentId, int numLike) {
        this.recipeName = recipeName;
        this.recipeDescription = recipeDescription;
        this.documentId = documentId;
        this.numLike = numLike;

    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public String getRecipeDescription() {
        return recipeDescription;
    }

    public void setRecipeDescription(String recipeDescription) {
        this.recipeDescription = recipeDescription;
    }

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public int getNumLike() {
        return numLike;
    }

    public void setNumLike(int numLike) {
        this.numLike = numLike;
    }

}
