package fi.organization.frb.Dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import fi.organization.frb.entities.Recipies

@Dao
interface RecipeQuery {
    @get:Query(value = "SELECT * FROM Recipes ORDER BY id DESC")
    val allRecipes: List<Recipies>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertRecipe(recipies: Recipies)
}