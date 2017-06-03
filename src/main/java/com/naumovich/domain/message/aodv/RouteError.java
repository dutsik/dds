package com.naumovich.domain.message.aodv;

import java.util.Objects;

public class RouteError extends AodvMessage {

    public final static int TYPE = 3;
    private String destNode;
    private int destSN;

    public RouteError(String destNode, int destSN) {
        this.destNode = destNode;
        this.destSN = destSN;
    }

    public String getDestNode() {
        return destNode;
    }

    public void setDestNode(String destNode) {
        this.destNode = destNode;
    }

    public int getDestSN() {
        return destSN;
    }

    public void setDestSN(int destSN) {
        this.destSN = destSN;
    }

    @Override
    public int getMessageType() {
        return TYPE;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RouteError that = (RouteError) o;
        return destSN == that.destSN &&
                Objects.equals(destNode, that.destNode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destNode, destSN);
    }

    @Override
    public String toString() {
        return "RouteError{" +
                "destNode=" + destNode +
                ", destSN=" + destSN +
                '}';
    }
}
