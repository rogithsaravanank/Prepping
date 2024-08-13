## SQL

```markdown
# Basic SQL Commands

## Command Descriptions
- **SELECT**: Select Data From Database
- **FROM**: Specify Table We're Pulling From
- **WHERE**: Filter Query To Match A Condition
- **AS**: Rename Column Or Table With Alias
- **JOIN**: Combine Rows From 2 Or More Tables
- **AND**: Combine Query Conditions. All Must Be Met
- **OR**: Combine Query Conditions. One Must Be Met
- **LIMIT**: Limit Rows Returned. See Also FETCH & TOP
- **IN**: Specify Multiple Values When Using WHERE
- **CASE**: Return Value On A Specified Condition
- **IS NULL**: Return Only Rows With A NULL Value
- **LIKE**: Search For Patterns In Column
- **COMMIT**: Write Transaction To Database
- **ROLLBACK**: Undo A Transaction Block
- **ALTER TABLE**: Add/Remove Columns From Table
- **UPDATE**: Update Table Data
- **CREATE**: Create TABLE, DATABASE, INDEX Or VIEW
- **DELETE**: Delete Rows From Table
- **INSERT**: Add Single Row To Table
- **DROP**: Delete TABLE, DATABASE Or INDEX
- **GROUP BY**: Group Data Into Logical Sets
- **ORDER BY**: Set Order Of Result. Use DESC To Reverse Order
- **HAVING**: Same As WHERE But Filters Groups
- **COUNT**: Count Number Of Rows
- **SUM**: Return Sum Of Column
- **AVG**: Return Average Of Column
- **MIN**: Return Min Value Of Column
- **MAX**: Return Max Value Of Column

## Example Queries
- **WHERE**: Filters records that meet a specific condition.
  - `SELECT name FROM users WHERE age > 25;`
- **ORDER BY**: Sorts the result set by one or more columns.
  - `SELECT name, age FROM users ORDER BY age DESC;`
- **GROUP BY**: Groups rows that have the same values into summary rows.
  - `SELECT age, COUNT(*) FROM users GROUP BY age;`
- **HAVING**: Filters groups based on a condition.
  - `SELECT age, COUNT(*) FROM users GROUP BY age HAVING COUNT(*) > 1;`
- **JOIN**: Combines rows from two or more tables based on a related column.
  - `SELECT users.name, orders.amount FROM users INNER JOIN orders ON users.id = orders.user_id;`
- **INNER JOIN**: Retrieves records with matching values in both tables.
  - `SELECT users.name, orders.amount FROM users INNER JOIN orders ON users.id = orders.user_id;`
- **LEFT JOIN**: Retrieves all records from the left table and matched records from the right table.
  - `SELECT users.name, orders.amount FROM users LEFT JOIN orders ON users.id = orders.user_id;`
- **RIGHT JOIN**: Retrieves all records from the right table and matched records from the left table.
  - `SELECT users.name, orders.amount FROM users RIGHT JOIN orders ON users.id = orders.user_id;`
- **FULL OUTER JOIN**: Retrieves records when there is a match in one of the tables.
  - `SELECT users.name, orders.amount FROM users FULL OUTER JOIN orders ON users.id = orders.user_id;`
```

You can save this text into a file with a `.md` extension (e.g., `sql_commands.md`).