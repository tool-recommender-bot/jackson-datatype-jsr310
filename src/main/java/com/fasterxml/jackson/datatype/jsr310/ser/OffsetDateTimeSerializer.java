package com.fasterxml.jackson.datatype.jsr310.ser;

import java.time.OffsetDateTime;

public class OffsetDateTimeSerializer extends InstantSerializerBase<OffsetDateTime>
{
    public static final OffsetDateTimeSerializer INSTANCE = new OffsetDateTimeSerializer();

    protected OffsetDateTimeSerializer() {
        super(OffsetDateTime.class, dt -> dt.toInstant().toEpochMilli(),
                OffsetDateTime::toEpochSecond, OffsetDateTime::getNano);
    }
}
