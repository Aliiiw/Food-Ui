# Food UI

Food UI is a native Android Jetpack Compose sample that builds a polished food detail screen. The app presents a strawberry cake page with a parallax image header, quick recipe information, serving controls, a shopping-list button, similar food cards, and suggested recipes.

The project is focused on UI composition and layout practice. It uses static sample data and local image/vector assets instead of a backend or dynamic recipe source.

## Features

- Jetpack Compose food detail screen
- Parallax-style top toolbar driven by `LazyListState`
- Large food hero image with gradient overlay
- Back and favorite circular toolbar buttons
- Recipe summary for time, calories, and rating
- Short food description section
- Interactive serving counter with plus and minus buttons
- Full-width `Add to shopping list` button
- Horizontally scrollable similar food cards
- Suggested recipe list with difficulty indicators
- Local drawable assets for food images and icons
- Custom color tokens for pink, light gray, and dark gray accents

## Tech Stack

- Kotlin
- Android Jetpack Compose
- Compose Material
- AndroidX Activity Compose
- Accompanist Insets
- Gradle / Android Gradle Plugin
- JUnit and AndroidX test dependencies

## Project Structure

```text
.
+-- README.md
+-- build.gradle
+-- settings.gradle
+-- gradle.properties
+-- app/
|   +-- build.gradle
|   +-- src/main/
|       +-- AndroidManifest.xml
|       +-- java/com/alirahimi/foodui/
|       |   +-- MainActivity.kt
|       |   +-- screens/
|       |   |   +-- FoodScreen.kt
|       |   +-- Content.kt
|       |   +-- ParallaxToolbar.kt
|       |   +-- BasicInformation.kt
|       |   +-- InformationColumn.kt
|       |   +-- Description.kt
|       |   +-- ServingNumber.kt
|       |   +-- ShoppingListButton.kt
|       |   +-- SimilarFoodsHeader.kt
|       |   +-- SimilarFoods.kt
|       |   +-- FastFoodItem.kt
|       |   +-- SimilarRecipiesHeader.kt
|       |   +-- SimilarRecipes.kt
|       |   +-- RecipeItem.kt
|       |   +-- CircularButton.kt
|       |   +-- ui/theme/
|       +-- res/drawable/
|       +-- res/values/
```

## Main Components

| Component | Purpose |
| --- | --- |
| `MainActivity` | Starts the Compose UI and renders `FoodScreen`. |
| `FoodScreen` | Combines the scrolling content and parallax toolbar in a shared `Box`. |
| `Content` | Hosts the `LazyColumn` content below the expanded app bar. |
| `ParallaxToolbar` | Displays the large image header, title, category label, and toolbar buttons. |
| `BasicInformation` | Shows preparation time, calories, and rating. |
| `InformationColumn` | Reusable icon-and-text info item. |
| `Description` | Shows the recipe description text. |
| `ServingNumber` | Keeps local Compose state for serving count and plus/minus controls. |
| `ShoppingListButton` | Renders the primary call-to-action button. |
| `SimilarFoods` | Shows horizontally scrollable food suggestion cards. |
| `FastFoodItem` | Reusable card for similar food items with image, category, and price. |
| `SimilarRecipes` | Displays a vertical list of suggested recipe rows. |
| `RecipeItem` | Reusable recipe row with image, category, difficulty, and arrow icon. |
| `CircularButton` | Shared small icon button used by toolbar and serving controls. |

## Screen Content

The current static screen presents:

| Section | Data |
| --- | --- |
| Main dish | `StrawBerry Cake` |
| Category label | `Desert` |
| Prep time | `23 min` |
| Calories | `720 kcal` |
| Rating | `4.9` |
| Default servings | `6` |

Similar food cards:

- Hot Dog
- Hamburger
- Doughnut
- Apple Pie

Suggested recipes:

- Cheesecake
- Cupcake
- Berry Cake

## UI Assets

The project includes local drawable assets for the food detail page and suggestion lists, including:

- Strawberry pie images
- Hot dog, hamburger, doughnut, and apple pie images
- Cheesecake, cupcake, and berry cake images
- Ingredient images such as eggs, flour, vanilla, potato, strawberry, and sugar
- Vector icons for clock, flame, star, favorite, plus, minus, back, and arrow-right actions

## Requirements

- Android Studio
- JDK 8 or newer
- Android SDK with compile SDK 32
- Android device or emulator running Android 5.0+ because `minSdk` is 21

Project configuration:

| Setting | Value |
| --- | --- |
| Application ID | `com.alirahimi.foodui` |
| Min SDK | 21 |
| Target SDK | 32 |
| Compile SDK | 32 |
| Version | 1.0 |
| Android Gradle Plugin | 7.1.3 |
| Kotlin Plugin | 1.5.21 |
| Compose Version | 1.0.1 |
| Accompanist Insets | 0.17.0 |

## How to Run

Open the project in Android Studio, let Gradle sync, then run the `app` configuration on an emulator or Android device.

From the terminal:

```bash
./gradlew assembleDebug
```

Install on a connected device:

```bash
./gradlew installDebug
```

## Notes

- This repository is a UI sample and does not connect to an API or database.
- Food data is hard-coded inside composables.
- The serving counter is local UI state and is not persisted.
- Buttons currently have placeholder click handlers.
- `ParallaxToolbar` uses `Accompanist Insets` for status bar padding.
- The file name `SimilarRecipiesHeader.kt` contains a spelling typo, while the composable is named `SimilarRecipesHeader`.

## Possible Improvements

- Move food and recipe data into model classes or a ViewModel
- Add navigation behavior for back, favorite, show more, and shopping list actions
- Add a proper ingredients section using the existing ingredient assets
- Persist serving count across configuration changes
- Add Compose previews for individual components
- Add screenshot assets or a short demo GIF to the README
- Update Compose, Kotlin, and Android Gradle Plugin versions
