package dao.model.base;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserGroupCriteria {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_group
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_group
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_group
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_group
     *
     * @mbg.generated
     */
    protected int limitStart = -1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_group
     *
     * @mbg.generated
     */
    protected int pageSize = -1;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_group
     *
     * @mbg.generated
     */
    public UserGroupCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_group
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_group
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_group
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_group
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_group
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_group
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_group
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_group
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_group
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_group
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_group
     *
     * @mbg.generated
     */
    public void setLimitStart(int limitStart) {
        this.limitStart=limitStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_group
     *
     * @mbg.generated
     */
    public int getLimitStart() {
        return limitStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_group
     *
     * @mbg.generated
     */
    public void setPageSize(int pageSize) {
        this.pageSize=pageSize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_group
     *
     * @mbg.generated
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table user_group
     *
     * @mbg.generated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andUserGroupIdIsNull() {
            addCriterion("user_group_id is null");
            return (Criteria) this;
        }

        public Criteria andUserGroupIdIsNotNull() {
            addCriterion("user_group_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserGroupIdEqualTo(String value) {
            addCriterion("user_group_id =", value, "userGroupId");
            return (Criteria) this;
        }

        public Criteria andUserGroupIdNotEqualTo(String value) {
            addCriterion("user_group_id <>", value, "userGroupId");
            return (Criteria) this;
        }

        public Criteria andUserGroupIdGreaterThan(String value) {
            addCriterion("user_group_id >", value, "userGroupId");
            return (Criteria) this;
        }

        public Criteria andUserGroupIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_group_id >=", value, "userGroupId");
            return (Criteria) this;
        }

        public Criteria andUserGroupIdLessThan(String value) {
            addCriterion("user_group_id <", value, "userGroupId");
            return (Criteria) this;
        }

        public Criteria andUserGroupIdLessThanOrEqualTo(String value) {
            addCriterion("user_group_id <=", value, "userGroupId");
            return (Criteria) this;
        }

        public Criteria andUserGroupIdLike(String value) {
            addCriterion("user_group_id like", value, "userGroupId");
            return (Criteria) this;
        }

        public Criteria andUserGroupIdNotLike(String value) {
            addCriterion("user_group_id not like", value, "userGroupId");
            return (Criteria) this;
        }

        public Criteria andUserGroupIdIn(List<String> values) {
            addCriterion("user_group_id in", values, "userGroupId");
            return (Criteria) this;
        }

        public Criteria andUserGroupIdNotIn(List<String> values) {
            addCriterion("user_group_id not in", values, "userGroupId");
            return (Criteria) this;
        }

        public Criteria andUserGroupIdBetween(String value1, String value2) {
            addCriterion("user_group_id between", value1, value2, "userGroupId");
            return (Criteria) this;
        }

        public Criteria andUserGroupIdNotBetween(String value1, String value2) {
            addCriterion("user_group_id not between", value1, value2, "userGroupId");
            return (Criteria) this;
        }

        public Criteria andUserGroupNameIsNull() {
            addCriterion("user_group_name is null");
            return (Criteria) this;
        }

        public Criteria andUserGroupNameIsNotNull() {
            addCriterion("user_group_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserGroupNameEqualTo(String value) {
            addCriterion("user_group_name =", value, "userGroupName");
            return (Criteria) this;
        }

        public Criteria andUserGroupNameNotEqualTo(String value) {
            addCriterion("user_group_name <>", value, "userGroupName");
            return (Criteria) this;
        }

        public Criteria andUserGroupNameGreaterThan(String value) {
            addCriterion("user_group_name >", value, "userGroupName");
            return (Criteria) this;
        }

        public Criteria andUserGroupNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_group_name >=", value, "userGroupName");
            return (Criteria) this;
        }

        public Criteria andUserGroupNameLessThan(String value) {
            addCriterion("user_group_name <", value, "userGroupName");
            return (Criteria) this;
        }

        public Criteria andUserGroupNameLessThanOrEqualTo(String value) {
            addCriterion("user_group_name <=", value, "userGroupName");
            return (Criteria) this;
        }

        public Criteria andUserGroupNameLike(String value) {
            addCriterion("user_group_name like", value, "userGroupName");
            return (Criteria) this;
        }

        public Criteria andUserGroupNameNotLike(String value) {
            addCriterion("user_group_name not like", value, "userGroupName");
            return (Criteria) this;
        }

        public Criteria andUserGroupNameIn(List<String> values) {
            addCriterion("user_group_name in", values, "userGroupName");
            return (Criteria) this;
        }

        public Criteria andUserGroupNameNotIn(List<String> values) {
            addCriterion("user_group_name not in", values, "userGroupName");
            return (Criteria) this;
        }

        public Criteria andUserGroupNameBetween(String value1, String value2) {
            addCriterion("user_group_name between", value1, value2, "userGroupName");
            return (Criteria) this;
        }

        public Criteria andUserGroupNameNotBetween(String value1, String value2) {
            addCriterion("user_group_name not between", value1, value2, "userGroupName");
            return (Criteria) this;
        }

        public Criteria andUserGroupParentIdIsNull() {
            addCriterion("user_group_parent_id is null");
            return (Criteria) this;
        }

        public Criteria andUserGroupParentIdIsNotNull() {
            addCriterion("user_group_parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserGroupParentIdEqualTo(String value) {
            addCriterion("user_group_parent_id =", value, "userGroupParentId");
            return (Criteria) this;
        }

        public Criteria andUserGroupParentIdNotEqualTo(String value) {
            addCriterion("user_group_parent_id <>", value, "userGroupParentId");
            return (Criteria) this;
        }

        public Criteria andUserGroupParentIdGreaterThan(String value) {
            addCriterion("user_group_parent_id >", value, "userGroupParentId");
            return (Criteria) this;
        }

        public Criteria andUserGroupParentIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_group_parent_id >=", value, "userGroupParentId");
            return (Criteria) this;
        }

        public Criteria andUserGroupParentIdLessThan(String value) {
            addCriterion("user_group_parent_id <", value, "userGroupParentId");
            return (Criteria) this;
        }

        public Criteria andUserGroupParentIdLessThanOrEqualTo(String value) {
            addCriterion("user_group_parent_id <=", value, "userGroupParentId");
            return (Criteria) this;
        }

        public Criteria andUserGroupParentIdLike(String value) {
            addCriterion("user_group_parent_id like", value, "userGroupParentId");
            return (Criteria) this;
        }

        public Criteria andUserGroupParentIdNotLike(String value) {
            addCriterion("user_group_parent_id not like", value, "userGroupParentId");
            return (Criteria) this;
        }

        public Criteria andUserGroupParentIdIn(List<String> values) {
            addCriterion("user_group_parent_id in", values, "userGroupParentId");
            return (Criteria) this;
        }

        public Criteria andUserGroupParentIdNotIn(List<String> values) {
            addCriterion("user_group_parent_id not in", values, "userGroupParentId");
            return (Criteria) this;
        }

        public Criteria andUserGroupParentIdBetween(String value1, String value2) {
            addCriterion("user_group_parent_id between", value1, value2, "userGroupParentId");
            return (Criteria) this;
        }

        public Criteria andUserGroupParentIdNotBetween(String value1, String value2) {
            addCriterion("user_group_parent_id not between", value1, value2, "userGroupParentId");
            return (Criteria) this;
        }

        public Criteria andUserGroupCreateTimeIsNull() {
            addCriterion("user_group_create_time is null");
            return (Criteria) this;
        }

        public Criteria andUserGroupCreateTimeIsNotNull() {
            addCriterion("user_group_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andUserGroupCreateTimeEqualTo(Date value) {
            addCriterion("user_group_create_time =", value, "userGroupCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserGroupCreateTimeNotEqualTo(Date value) {
            addCriterion("user_group_create_time <>", value, "userGroupCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserGroupCreateTimeGreaterThan(Date value) {
            addCriterion("user_group_create_time >", value, "userGroupCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserGroupCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("user_group_create_time >=", value, "userGroupCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserGroupCreateTimeLessThan(Date value) {
            addCriterion("user_group_create_time <", value, "userGroupCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserGroupCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("user_group_create_time <=", value, "userGroupCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserGroupCreateTimeIn(List<Date> values) {
            addCriterion("user_group_create_time in", values, "userGroupCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserGroupCreateTimeNotIn(List<Date> values) {
            addCriterion("user_group_create_time not in", values, "userGroupCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserGroupCreateTimeBetween(Date value1, Date value2) {
            addCriterion("user_group_create_time between", value1, value2, "userGroupCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserGroupCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("user_group_create_time not between", value1, value2, "userGroupCreateTime");
            return (Criteria) this;
        }

        public Criteria andUserGroupUpdateTimeIsNull() {
            addCriterion("user_group_update_time is null");
            return (Criteria) this;
        }

        public Criteria andUserGroupUpdateTimeIsNotNull() {
            addCriterion("user_group_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUserGroupUpdateTimeEqualTo(Date value) {
            addCriterion("user_group_update_time =", value, "userGroupUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserGroupUpdateTimeNotEqualTo(Date value) {
            addCriterion("user_group_update_time <>", value, "userGroupUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserGroupUpdateTimeGreaterThan(Date value) {
            addCriterion("user_group_update_time >", value, "userGroupUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserGroupUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("user_group_update_time >=", value, "userGroupUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserGroupUpdateTimeLessThan(Date value) {
            addCriterion("user_group_update_time <", value, "userGroupUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserGroupUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("user_group_update_time <=", value, "userGroupUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserGroupUpdateTimeIn(List<Date> values) {
            addCriterion("user_group_update_time in", values, "userGroupUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserGroupUpdateTimeNotIn(List<Date> values) {
            addCriterion("user_group_update_time not in", values, "userGroupUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserGroupUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("user_group_update_time between", value1, value2, "userGroupUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserGroupUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("user_group_update_time not between", value1, value2, "userGroupUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUserGroupStateIsNull() {
            addCriterion("user_group_state is null");
            return (Criteria) this;
        }

        public Criteria andUserGroupStateIsNotNull() {
            addCriterion("user_group_state is not null");
            return (Criteria) this;
        }

        public Criteria andUserGroupStateEqualTo(Byte value) {
            addCriterion("user_group_state =", value, "userGroupState");
            return (Criteria) this;
        }

        public Criteria andUserGroupStateNotEqualTo(Byte value) {
            addCriterion("user_group_state <>", value, "userGroupState");
            return (Criteria) this;
        }

        public Criteria andUserGroupStateGreaterThan(Byte value) {
            addCriterion("user_group_state >", value, "userGroupState");
            return (Criteria) this;
        }

        public Criteria andUserGroupStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("user_group_state >=", value, "userGroupState");
            return (Criteria) this;
        }

        public Criteria andUserGroupStateLessThan(Byte value) {
            addCriterion("user_group_state <", value, "userGroupState");
            return (Criteria) this;
        }

        public Criteria andUserGroupStateLessThanOrEqualTo(Byte value) {
            addCriterion("user_group_state <=", value, "userGroupState");
            return (Criteria) this;
        }

        public Criteria andUserGroupStateIn(List<Byte> values) {
            addCriterion("user_group_state in", values, "userGroupState");
            return (Criteria) this;
        }

        public Criteria andUserGroupStateNotIn(List<Byte> values) {
            addCriterion("user_group_state not in", values, "userGroupState");
            return (Criteria) this;
        }

        public Criteria andUserGroupStateBetween(Byte value1, Byte value2) {
            addCriterion("user_group_state between", value1, value2, "userGroupState");
            return (Criteria) this;
        }

        public Criteria andUserGroupStateNotBetween(Byte value1, Byte value2) {
            addCriterion("user_group_state not between", value1, value2, "userGroupState");
            return (Criteria) this;
        }

        public Criteria andUserGroupTopIdIsNull() {
            addCriterion("user_group_top_id is null");
            return (Criteria) this;
        }

        public Criteria andUserGroupTopIdIsNotNull() {
            addCriterion("user_group_top_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserGroupTopIdEqualTo(String value) {
            addCriterion("user_group_top_id =", value, "userGroupTopId");
            return (Criteria) this;
        }

        public Criteria andUserGroupTopIdNotEqualTo(String value) {
            addCriterion("user_group_top_id <>", value, "userGroupTopId");
            return (Criteria) this;
        }

        public Criteria andUserGroupTopIdGreaterThan(String value) {
            addCriterion("user_group_top_id >", value, "userGroupTopId");
            return (Criteria) this;
        }

        public Criteria andUserGroupTopIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_group_top_id >=", value, "userGroupTopId");
            return (Criteria) this;
        }

        public Criteria andUserGroupTopIdLessThan(String value) {
            addCriterion("user_group_top_id <", value, "userGroupTopId");
            return (Criteria) this;
        }

        public Criteria andUserGroupTopIdLessThanOrEqualTo(String value) {
            addCriterion("user_group_top_id <=", value, "userGroupTopId");
            return (Criteria) this;
        }

        public Criteria andUserGroupTopIdLike(String value) {
            addCriterion("user_group_top_id like", value, "userGroupTopId");
            return (Criteria) this;
        }

        public Criteria andUserGroupTopIdNotLike(String value) {
            addCriterion("user_group_top_id not like", value, "userGroupTopId");
            return (Criteria) this;
        }

        public Criteria andUserGroupTopIdIn(List<String> values) {
            addCriterion("user_group_top_id in", values, "userGroupTopId");
            return (Criteria) this;
        }

        public Criteria andUserGroupTopIdNotIn(List<String> values) {
            addCriterion("user_group_top_id not in", values, "userGroupTopId");
            return (Criteria) this;
        }

        public Criteria andUserGroupTopIdBetween(String value1, String value2) {
            addCriterion("user_group_top_id between", value1, value2, "userGroupTopId");
            return (Criteria) this;
        }

        public Criteria andUserGroupTopIdNotBetween(String value1, String value2) {
            addCriterion("user_group_top_id not between", value1, value2, "userGroupTopId");
            return (Criteria) this;
        }

        public Criteria andUserGroupIdLikeInsensitive(String value) {
            addCriterion("upper(user_group_id) like", value.toUpperCase(), "userGroupId");
            return (Criteria) this;
        }

        public Criteria andUserGroupNameLikeInsensitive(String value) {
            addCriterion("upper(user_group_name) like", value.toUpperCase(), "userGroupName");
            return (Criteria) this;
        }

        public Criteria andUserGroupParentIdLikeInsensitive(String value) {
            addCriterion("upper(user_group_parent_id) like", value.toUpperCase(), "userGroupParentId");
            return (Criteria) this;
        }

        public Criteria andUserGroupTopIdLikeInsensitive(String value) {
            addCriterion("upper(user_group_top_id) like", value.toUpperCase(), "userGroupTopId");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table user_group
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table user_group
     *
     * @mbg.generated
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}