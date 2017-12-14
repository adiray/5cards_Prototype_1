package com.example.dell.a5cards_prototype_1.utility;

        import com.google.gson.annotations.Expose;
        import com.google.gson.annotations.SerializedName;

public class FeaturedResponse {

    @SerializedName("objectId")
    @Expose
    private String objectId;
    @SerializedName("DESCRIPTION")
    @Expose
    private String dESCRIPTION;
    @SerializedName("ownerId")
    @Expose
    private String ownerId;
    @SerializedName("PRODUCT_NAME")
    @Expose
    private String pRODUCTNAME;
    @SerializedName("created")
    @Expose
    private Long created;
    @SerializedName("FEATURED")
    @Expose
    private Boolean fEATURED;
    @SerializedName("PRODUCT_PRICE")
    @Expose
    private String pRODUCTPRICE;
    @SerializedName("PRODUCT_IMAGE_REFERENCE")
    @Expose
    private String pRODUCTIMAGEREFERENCE;
    @SerializedName("updated")
    @Expose
    private Long updated;
    @SerializedName("___class")
    @Expose
    private String _class;
    @SerializedName("__meta")
    @Expose
    private String meta;

    /**
     * No args constructor for use in serialization
     */
    public FeaturedResponse() {
    }

    /**
     * @param pRODUCTNAME
     * @param pRODUCTIMAGEREFERENCE
     * @param _class
     * @param fEATURED
     * @param updated
     * @param created
     * @param pRODUCTPRICE
     * @param ownerId
     * @param objectId
     * @param dESCRIPTION
     * @param meta
     */
    public FeaturedResponse(String objectId, String dESCRIPTION, String ownerId, String pRODUCTNAME, Long created, Boolean fEATURED, String pRODUCTPRICE, String pRODUCTIMAGEREFERENCE, Long updated, String _class, String meta) {
        super();
        this.objectId = objectId;
        this.dESCRIPTION = dESCRIPTION;
        this.ownerId = ownerId;
        this.pRODUCTNAME = pRODUCTNAME;
        this.created = created;
        this.fEATURED = fEATURED;
        this.pRODUCTPRICE = pRODUCTPRICE;
        this.pRODUCTIMAGEREFERENCE = pRODUCTIMAGEREFERENCE;
        this.updated = updated;
        this._class = _class;
        this.meta = meta;
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public String getDESCRIPTION() {
        return dESCRIPTION;
    }

    public void setDESCRIPTION(String dESCRIPTION) {
        this.dESCRIPTION = dESCRIPTION;
    }

    public Object getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getPRODUCTNAME() {
        return pRODUCTNAME;
    }

    public void setPRODUCTNAME(String pRODUCTNAME) {
        this.pRODUCTNAME = pRODUCTNAME;
    }

    public Long getCreated() {
        return created;
    }

    public void setCreated(Long created) {
        this.created = created;
    }

    public Boolean getFEATURED() {
        return fEATURED;
    }

    public void setFEATURED(Boolean fEATURED) {
        this.fEATURED = fEATURED;
    }

    public String getPRODUCTPRICE() {
        return pRODUCTPRICE;
    }

    public void setPRODUCTPRICE(String pRODUCTPRICE) {
        this.pRODUCTPRICE = pRODUCTPRICE;
    }

    public String getPRODUCTIMAGEREFERENCE() {
        return pRODUCTIMAGEREFERENCE;
    }

    public void setPRODUCTIMAGEREFERENCE(String pRODUCTIMAGEREFERENCE) {
        this.pRODUCTIMAGEREFERENCE = pRODUCTIMAGEREFERENCE;
    }

    public Long getUpdated() {
        return updated;
    }

    public void setUpdated(Long updated) {
        this.updated = updated;
    }

    public String getClass_() {
        return _class;
    }

    public void setClass_(String _class) {
        this._class = _class;
    }

    public String getMeta() {
        return meta;
    }

    public void setMeta(String meta) {
        this.meta = meta;
    }

}
