package com.upc.help_sys.dao.entity;


import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by Liuyibo on 2017/3/22.
 *      帮助信息实体类
 */
@Entity
@Component
public class HelpInfo {
    @Id
    @GeneratedValue
    private int id;  //编号,自增
    private int category;//种类
    private String content;//内容
    private String destination_from;//目的地(从)
    private String destination_to;//目的地(去)
    private float tip;//悬赏金额
    private int accepter_id;//接单人id
    private int creator_id;//创建人id
    private Timestamp deadline;//最迟完成时间
    private int state_num;//状态字段

    public int getNeed_person() {
        return need_person;
    }

    public void setNeed_person(int need_person) {
        this.need_person = need_person;
    }

    private int need_person;//需要多少人
    public int getId() {
        return id;
    }
    public int getCreator_id() {
        return creator_id;
    }

    public void setCreator_id(int creator_id) {
        this.creator_id = creator_id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDestination_from() {
        return destination_from;
    }

    public void setDestination_from(String destination_from) {
        this.destination_from = destination_from;
    }

    public String getDestination_to() {
        return destination_to;
    }

    public void setDestination_to(String destination_to) {
        this.destination_to = destination_to;
    }

    public float getTip() {
        return tip;
    }

    public void setTip(float tip) {
        this.tip = tip;
    }

    public int getAccepter_id() {
        return accepter_id;
    }

    public void setAccepter_id(int accepter_id) {
        this.accepter_id = accepter_id;
    }


    public Timestamp getDeadline() {
        if (deadline == null) {
            return null;
        }
        return (Timestamp) deadline.clone();
    }

    public void setDeadline(Timestamp deadline) {
        if (deadline == null) {
            this.deadline = null;
        } else {
            this.deadline = (Timestamp) deadline.clone();
        }
    }

    public int getState_num() {
        return state_num;
    }

    public void setState_num(int state_num) {
        this.state_num = state_num;
    }


}
