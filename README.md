# Observer-Pattern
Implementation of Observer Pattern


Observer pattern implementation:
Chris Elliott
Neil Christensen
Siv Yeramati

Definition: 
-	Defines a one-to-many dependency between objects so that when one object (subject) changes state, all its dependents (observers) are notified and updated automatically.

Used for:
-	Maintaining consistency across redundant state
-	Optimizing batch changes to maintain consistency

Implementation:
-	We used the observer pattern to notify newspaper subscribers when the new issue was released.
-	When the price of the newspaper is set to 20 dollars per issue, it is not yet available, and 3 subscribers choose to be notified when the next issue is available.
-	When the new issue is released, they are notified. 
-	When the price is reduced to 10 dollars per issue, only 2 subscribers choose to be notified when the next issue is released. 
-	When the new issue is released, they are notified.

:
-	Our implementation allows the newspaper subscribers to be aware when the next issue is released so they can go pick it up. Without this they would be left wondering when the next issue is available, and would spend their valuable time checking if it is released yet, only to find it is still being printed and not ready for purchase. With our solution, they now know immediately when the issue is available and less of the customer’s time is wasted.
