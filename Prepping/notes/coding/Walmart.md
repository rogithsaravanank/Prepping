### **1. Merge Intervals (Coding Question)**
#### **Problem**
Given a list of intervals, merge all overlapping intervals and return the resulting list of non-overlapping intervals.

#### **Approach**
1. **Sort** the intervals by the start time.
2. Traverse through the intervals:
   - Compare the end time of the current interval with the start time of the next interval.
   - If they overlap, merge them by updating the end time.
   - Otherwise, add the current interval to the result.

#### **Code Implementation (Java)**
```java
import java.util.*;

class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) return intervals;

        // Step 1: Sort intervals by the start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> result = new ArrayList<>();

        // Step 2: Merge intervals
        int[] currentInterval = intervals[0];
        result.add(currentInterval);

        for (int[] interval : intervals) {
            int currentEnd = currentInterval[1];
            int nextStart = interval[0];
            int nextEnd = interval[1];

            if (currentEnd >= nextStart) { // Overlapping intervals
                currentInterval[1] = Math.max(currentEnd, nextEnd);
            } else {
                currentInterval = interval;
                result.add(currentInterval);
            }
        }

        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        MergeIntervals mi = new MergeIntervals();
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] merged = mi.merge(intervals);

        for (int[] interval : merged) {
            System.out.println(Arrays.toString(interval));
        }
    }
}
```

#### **Example**
Input: `[[1,3],[2,6],[8,10],[15,18]]`  
Output: `[[1,6],[8,10],[15,18]]`

---

### **2. Design a Power BI Reporting System (System Design Question)**

#### **Key Considerations**
- **Goal**: Design a scalable system to aggregate, transform, and visualize data in Power BI dashboards.
- **Components**:
  1. **Data Sources**:
     - Define supported sources (databases, APIs, flat files).
     - Handle diverse formats (SQL, CSV, Excel, JSON).
  2. **Data Pipeline**:
     - ETL (Extract, Transform, Load) pipeline to clean and preprocess data.
     - Use tools like **Azure Data Factory**, **SSIS**, or open-source tools (e.g., Apache NiFi).
  3. **Data Warehouse**:
     - Store aggregated data in a database like Azure SQL Data Warehouse, Snowflake, or Amazon Redshift.
     - Enable efficient querying for large datasets.
  4. **Power BI Service**:
     - Connect the data warehouse to Power BI.
     - Design datasets, relationships, and measures.
  5. **Dashboards**:
     - Design interactive and real-time dashboards.
     - Allow filtering, drill-downs, and KPIs.

#### **High-Level Architecture**
1. **Data Sources** → **ETL Tool** → **Data Warehouse** → **Power BI** → **Users**
   - Data refresh can be real-time or scheduled.
   - Ensure robust security using role-based access control (RBAC).

#### **Challenges to Address**
- **Data Latency**: Use incremental refresh for large datasets.
- **Scalability**: Optimize queries and data models.
- **Data Security**: Encrypt data in transit and at rest.
- **User Management**: Provide row-level security for different user roles.

---

By addressing both problems clearly and concisely, you demonstrate strong coding skills and a solid understanding of system design principles. Let me know if you'd like further refinements or explanations!