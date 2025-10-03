# AND101 Project 4 - Calc1

Submitted by: **Jade Cook**

Time spent: **3** hours spent in total

## Summary

**Calc1** is a simple utility Android app that helps users calculate tips based on a bill amount and a tip percentage. Users input their bill, enter the desired tip %, and the app instantly calculates the tip amount and total bill. This project demonstrates handling user input, button interaction, and displaying calculated output.

If I had to describe this project in three (3) emojis, they would be: 💸🧮🍽️

---

## Application Features

The following REQUIRED features are completed:

- [x] At least one (1) user input (EditText for bill and tip percentage)
- [x] At least one (1) interactive View (Button to trigger calculation)
- [x] At least one (1) output of a calculation based on the user input (TextView showing tip and total)

The following STRETCH features are implemented:

- [ ] Automatically updates the calculation when typing (using `addTextChangedListener`)
- [ ] Quick-select buttons for common tip percentages (10%, 15%, 20%)
- [ ] Rounded-up total feature

The following EXTRA features are implemented:

- [ ] — 

---

## Video Demo

Here’s a GIF walkthrough of the app’s core features:

<img src='https://i.imgur.com/your-gif-link.gif' title='Video Demo' width='300' alt='Video Demo' />

GIF created with **Kap** for macOS.

---

## Notes

- This project taught me how to process numeric input safely in Kotlin using `.toDoubleOrNull()` and handle invalid input gracefully.
- I learned how to use **ViewBinding** to simplify referencing UI elements without `findViewById()`.
- I also gained more practice with `ConstraintLayout` for organizing UI components.

---

## License

Copyright **2025** **Jade Cook**

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at:

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
