package leetcode.twohundred200;

/**
 * Created by ray on 7/23/17.
 *
 *
 *
 * 考虑没有选到为空的情况  一个是选择再select 一次就能解决 没有设为null的问题,另一个是 用ifnull来设置,并且 都要注意使用distinct
 */
public class Q176SecondHighestSalary {

    //法一
//    SELECT
//    (SELECT DISTINCT
//     Salary
//             FROM
//             Employee
//             ORDER BY Salary DESC
//             LIMIT 1 OFFSET 1) AS SecondHighestSalary
//    ;


    //法二
//    select
//    IFNULL ((select distinct
//            Salary
//                    from Employee
//                    order by Salary desc
//                    limit 1 offset 1)
//    , NULL) as SecondHighestSalary;
}
