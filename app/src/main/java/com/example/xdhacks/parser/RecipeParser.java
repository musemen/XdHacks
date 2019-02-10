package com.example.xdhacks;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class RecipeParser {

    /**
     * Prints library parsed from JSON data to console
     * @param jsonData  string containing JSON data
     * @throws JSONException when jsonData cannot be parsed as a JSONArray
     */
    public void parseLibrary(String jsonData) throws JSONException {
        JSONArray library = new JSONArray(jsonData);

        for (int index = 0; index < library.length(); index++) {
            JSONObject book = library.getJSONObject(index);
            parseBook(book);
        }
    }

    /**
     * Prints book parsed from JSON object to console
     * @param book  a JSON object representing a book
     * @throws JSONException when book does not have a title or an author field
     */
    private void parseBook(JSONObject book) throws JSONException {
        String title = book.getString("title");
        String author = book.getString("author");

        System.out.println("Parsed a book!");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println();
    }
}