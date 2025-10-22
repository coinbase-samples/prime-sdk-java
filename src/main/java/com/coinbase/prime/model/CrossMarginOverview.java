package com.coinbase.prime.model;

import com.coinbase.prime.model.enums.XMControlStatus;
import com.coinbase.prime.model.enums.XMEntityCallStatus;
import com.coinbase.prime.model.XMLoan;
import com.coinbase.prime.model.XMMarginCall;
import com.coinbase.prime.model.enums.XMMarginLevel;
import com.coinbase.prime.model.XMSummary;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CrossMarginOverview {
    private XMControlStatus controlStatus;

    private XMEntityCallStatus callStatus;

    private XMMarginLevel marginLevel;

    private XMSummary marginSummary;

    /**
     * List of active XM margin calls
     */
    private List<XMMarginCall> activeMarginCalls;

    /**
     * List of active XM loans
     */
    private List<XMLoan> activeLoans;

    public CrossMarginOverview() {
    }

    public CrossMarginOverview(Builder builder) {
        this.controlStatus = builder.controlStatus;
        this.callStatus = builder.callStatus;
        this.marginLevel = builder.marginLevel;
        this.marginSummary = builder.marginSummary;
        this.activeMarginCalls = builder.activeMarginCalls;
        this.activeLoans = builder.activeLoans;
    }
    public XMControlStatus getControlStatus() {
        return controlStatus;
    }

    public void setControlStatus(XMControlStatus controlStatus) {
        this.controlStatus = controlStatus;
    }
    public XMEntityCallStatus getCallStatus() {
        return callStatus;
    }

    public void setCallStatus(XMEntityCallStatus callStatus) {
        this.callStatus = callStatus;
    }
    public XMMarginLevel getMarginLevel() {
        return marginLevel;
    }

    public void setMarginLevel(XMMarginLevel marginLevel) {
        this.marginLevel = marginLevel;
    }
    public XMSummary getMarginSummary() {
        return marginSummary;
    }

    public void setMarginSummary(XMSummary marginSummary) {
        this.marginSummary = marginSummary;
    }
    public List<XMMarginCall> getActiveMarginCalls() {
        return activeMarginCalls;
    }

    public void setActiveMarginCalls(List<XMMarginCall> activeMarginCalls) {
        this.activeMarginCalls = activeMarginCalls;
    }
    public List<XMLoan> getActiveLoans() {
        return activeLoans;
    }

    public void setActiveLoans(List<XMLoan> activeLoans) {
        this.activeLoans = activeLoans;
    }
    public static class Builder {
        private XMControlStatus controlStatus;

        private XMEntityCallStatus callStatus;

        private XMMarginLevel marginLevel;

        private XMSummary marginSummary;

        private List<XMMarginCall> activeMarginCalls;

        private List<XMLoan> activeLoans;

        public Builder controlStatus(XMControlStatus controlStatus) {
            this.controlStatus = controlStatus;
            return this;
        }

        public Builder callStatus(XMEntityCallStatus callStatus) {
            this.callStatus = callStatus;
            return this;
        }

        public Builder marginLevel(XMMarginLevel marginLevel) {
            this.marginLevel = marginLevel;
            return this;
        }

        public Builder marginSummary(XMSummary marginSummary) {
            this.marginSummary = marginSummary;
            return this;
        }

        public Builder activeMarginCalls(List<XMMarginCall> activeMarginCalls) {
            this.activeMarginCalls = activeMarginCalls;
            return this;
        }

        public Builder activeLoans(List<XMLoan> activeLoans) {
            this.activeLoans = activeLoans;
            return this;
        }

        public CrossMarginOverview build() {
            return new CrossMarginOverview(this);
        }
    }
}

