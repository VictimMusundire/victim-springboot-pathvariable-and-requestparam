#Pathvariable and RequestParam

**required = false** indicates that this query param is NOT mandatory on **RequestParam**.

**Differences between these two.**
**1)** @RequestParam is used to get query parameters while @PathVariable is used to get data from URI.
**2)** @RequestParam is mostly useful for traditional web apps where data comes in query parameters. For ex. web form submission. While @PathVariable is useful for REST APIs.

