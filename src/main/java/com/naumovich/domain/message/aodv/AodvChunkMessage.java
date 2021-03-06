package com.naumovich.domain.message.aodv;

import com.naumovich.domain.Chunk;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class AodvChunkMessage extends AodvMessage {

    private final static int TYPE = 4;
    private String destNode;
    private String sourceNode;
    private Chunk chunk;

    public AodvChunkMessage(String destNode, Chunk chunk) {
        this.destNode = destNode;
        this.sourceNode = chunk.getOriginalOwner().getLogin();
        this.chunk = chunk;
    }

    @Override
    public int getMessageType() {
        return TYPE;
    }

}
