package com.jk.example.jpa;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student implements Serializable {

        @Id
        @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        @Column(name = "number")
        private String number;

        @Column(name = "name")
        private String name;

        @Column(name = "avg")
        private Double avg;

        @Column(name = "phone")
        private String phone;

        public void setId(Integer id) {
                this.id = id;
        }

        public Integer getId() {
                return this.id;
        }

        public void setNumber(String number) {
                this.number = number;
        }

        public String getNumber() {
                return this.number;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getName() {
                return this.name;
        }

        public void setAvg(Double avg) {
                this.avg = avg;
        }

        public Double getAvg() {
                return this.avg;
        }

        public void setPhone(String phone) {
                this.phone = phone;
        }

        public String getPhone() {
                return this.phone;
        }

        @Override
        public String toString() {
                StringBuffer buf = new StringBuffer();
                buf.append(this.number).append(" ");
                buf.append(",");
                buf.append(this.name).append(" ");
                buf.append(",");
                buf.append(this.avg).append(" ");
                buf.append(",");
                buf.append(this.phone).append(" ");
                return buf.toString();
        }

        @Override
        public boolean equals(Object obj) {
                if (obj == null) {
                        return false;
                }
                return this.getId() == ((Student) obj).getId();
        }
}