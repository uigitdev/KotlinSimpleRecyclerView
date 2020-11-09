# KotlinSimpleRecyclerView

Hey everyone!
We will create a simple listing in Kotlin.
We will create a new element with a background class and show that we can use it dynamically.

YouTube video: https://www.youtube.com/watch?v=9KU4nE_J8H8&ab_channel=Uigitdev

![screenshot](https://user-images.githubusercontent.com/46577836/98578452-aa85f080-22bd-11eb-91ca-958ad345f8c4.png)

Steps:

1. Add the 2 implementation lines.

2. Create the simple_item.xml file in the layout folder.

3. Create a background class for the item so that you can easily modify the item data at runtime. design-> DesignItem

4. Add the RecyclerView list to your main screen.

5. Create your own data model class. list-> ItemObject

6. Create the ViewHolder class list-> ListViewHolder for the list
(Add your own item)

7. Create the adapter list-> ListAdapter

onCreateViewHolder = we add an xml view of our created item.

getItemCount = we specify the size of our list.

onBindViewHolder = we add custom methods to our design element.

8. We create an example list in our main class.

9. We will display our list in our main department.
