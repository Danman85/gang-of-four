# Visitor Pattern pro's and cons

## Pro's

1. The behaviour of the concerned visitor implementation is located in one class, for all consumers. Making it easy to see what sort of implementations there are.
2. It is relatively easy to implement new visitors for new behaviours to a class hierarchy. Reducing the ampount of refactoring on existing consumers.
3. This pattern facilitates an easy way to gather information of the concrete visitors. It becomes easy to track, which consumers use which visitor and how often.

## Cons

1. When adding, or removing a class to the hierarchy all visitors need to be refactored.
2. One has to pay close attention that the visitors cannot access any fields or methods which are scoped to private.
3. The ```accept()``` method in the consuming classes is very rigid in terms of it's signature. Pay special attention when defining new visiors, as they might need a differen signiture. If that is the case, the entire point of keeping your business logic centralized is about to be lost.
