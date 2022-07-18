Equivalence Class
---
| Input                                     | Valid Equivalence Class                                                                                                                         | Invalid Equivalence Class                                                             |
|-------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------|
| Number of files                           | 2 files                                                                                                                                         | 1 file or more than 3 files                                                           |
| File Type                                 | Both files are .csv                                                                                                                             | At least one of the files is not .csv                                                 |
| Column Numbers                            | Both files are 5                                                                                                                                | At least one of the files is not 5                                                    |
| Row Numbers                               | file 1 == file 2                                                                                                                                | file 1 != file 2                                                                      |
| Duplicated Rows                           | No rows duplicate in both files                                                                                                                 | At least one file has duplicated rows                                                 |
Test Cases
---
| Test Case Num | Test Case                                                                                                         | Middle or Boundary | Expected Outcome(Rejected or Accepted) |
|---------------|-------------------------------------------------------------------------------------------------------------------|--------------------|----------------------------------------|
| 1             | 2 exactly same .csv files including 5 columns(No duplicate)                                                       | Boundary           | Accepted                               |
| 2             | 2 .csv files with some content rows different including 5 columns(No duplicate)                                   | Middle             | Accepted                               |
| 3             | 2 .csv files with every content rows different including 5 columns(No duplicate)                                  | Boundary           | Accepted                               |
| 4             | 2 .csv files with some content rows (No duplicate), one of which contains only 4 columns                          | Boundary           | Rejected                               |
| 5             | 2 .csv files with some content rows (No duplicate), both of which contains only 4 columns                         | Boundary           | Rejected                               |
| 5             | 2 .csv files with some content rows (No duplicate), one of which contains only 2 columns and another contains 3   | Middle             | Rejected                               |
| 6             | 2 .csv files with some content rows different including 5 columns(With duplicate)                                 | Middle             | Rejected                               |
| 7             | 2 .csv files with some content rows (With duplicate), one of which contains only 2 columns and another contains 3 | Middle             | Rejected                               |
| 7             | 1 .csv file                                                                                                       | Boundary           | Rejected                               |
| 8             | 1 .csv file and 1 .xslx file                                                                                      | Middle             | Rejected                               |
| 9             | 2 .xslx files                                                                                                     | Boundary           | Rejected                               |
| 10            | 22 .csv files                                                                                                     | Middle             | Rejected                               |


