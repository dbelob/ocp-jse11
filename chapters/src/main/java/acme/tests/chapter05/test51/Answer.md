# Explanation

E.

Line 6 assigns an int to a cell in a 2D array. This is fine. Line 7 casts to a general Object[]. This is dangerous, but legal. Why is it dangerous, you ask? That brings us to line 8. The compiler can't protect us from assigning a String to the int[] because the reference is more generic.

Therefore, line 8 throws an ArrayStoreException because the type is incorrect, and option E is correct. You couldn't have assigned an int on line 8 either because obj\[3\] is really an int[] behind the scenes and not an int.
