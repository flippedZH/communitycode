package com.wenmrong.community1.community.model;

public class Thumb {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column THUMB.ID
     *
     * @mbg.generated Thu May 28 09:25:06 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column THUMB.THUMB_ID
     *
     * @mbg.generated Thu May 28 09:25:06 CST 2020
     */
    private Long thumbId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column THUMB.THUMB_ID_PARENT
     *
     * @mbg.generated Thu May 28 09:25:06 CST 2020
     */
    private Long thumbIdParent;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column THUMB.ID
     *
     * @return the value of THUMB.ID
     *
     * @mbg.generated Thu May 28 09:25:06 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column THUMB.ID
     *
     * @param id the value for THUMB.ID
     *
     * @mbg.generated Thu May 28 09:25:06 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column THUMB.THUMB_ID
     *
     * @return the value of THUMB.THUMB_ID
     *
     * @mbg.generated Thu May 28 09:25:06 CST 2020
     */
    public Long getThumbId() {
        return thumbId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column THUMB.THUMB_ID
     *
     * @param thumbId the value for THUMB.THUMB_ID
     *
     * @mbg.generated Thu May 28 09:25:06 CST 2020
     */
    public void setThumbId(Long thumbId) {
        this.thumbId = thumbId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column THUMB.THUMB_ID_PARENT
     *
     * @return the value of THUMB.THUMB_ID_PARENT
     *
     * @mbg.generated Thu May 28 09:25:06 CST 2020
     */
    public Long getThumbIdParent() {
        return thumbIdParent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column THUMB.THUMB_ID_PARENT
     *
     * @param thumbIdParent the value for THUMB.THUMB_ID_PARENT
     *
     * @mbg.generated Thu May 28 09:25:06 CST 2020
     */
    public void setThumbIdParent(Long thumbIdParent) {
        this.thumbIdParent = thumbIdParent;
    }
}