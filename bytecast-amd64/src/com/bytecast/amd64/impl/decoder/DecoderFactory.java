/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bytecast.amd64.impl.decoder;

import com.bytecast.amd64.api.constants.InstructionType;
import com.bytecast.amd64.internal.api.parser.IInstructionDecoder;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author harsh
 */
public class DecoderFactory {
    private static Map<InstructionType, IInstructionDecoder> decoders = new HashMap<InstructionType, IInstructionDecoder>();

    static{
        decoders.put(InstructionType.RET, new RETInstructionDecoder());
    }
    
    
    
    public static IInstructionDecoder getInstructionDecoder(InstructionType type)
    {
        return decoders.get(type);
    }
}