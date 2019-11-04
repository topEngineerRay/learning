/*package com.sap.ngom.learning;

import java.io.IOException;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.fge.jsonpatch.JsonPatch;
import com.github.fge.jsonpatch.JsonPatchException;
import com.github.fge.jsonpatch.diff.JsonDiff;

public class JsonPatchTest {
    
    final static ObjectMapper mapper = new ObjectMapper();
    
    public static void main(String[] args) {
     // Using Jackson
       
        //final InputStream in = ...;
        //final JsonPatch patch = JsonDiff.asJsonPatch(source, target)
        //final String in = "";
        //final JsonPatch patch = mapper.readValue(in, JsonPatch.class);
        // From a JsonNode
       // final JsonPatch patch = JsonPatch.fromJson(node);
        //Object object = patch(patch, in, null);
       
    }
    
        public static <T> T patch(Object entity, String patchJson, Class<T> valueType) {
            try {
            JsonNode patchAsNode = mapper.readTree(patchJson);
            JsonPatch patchTool = JsonPatch.fromJson(patchAsNode);
            JsonNode entityAsNode = mapper.valueToTree(entity);
            JsonNode modifiedAsNode = patchTool.apply(entityAsNode);
            return mapper.treeToValue(modifiedAsNode, valueType);
            } catch (IOException | JsonPatchException ex) {
            //throw new JaqpotSerializationException(ex);
            throw null;
            }
        }
        
        public static <T> T patchNew(Object oldValue, String patchJson, Class<T> valueType) {
            try {
            JsonNode patchAsNode = mapper.readTree(patchJson);
            JsonPatch patchTool = JsonPatch.fromJson(patchAsNode);
            JsonNode entityAsNode = mapper.valueToTree(oldValue);
            JsonNode modifiedAsNode = patchTool.apply(entityAsNode);
            return mapper.treeToValue(modifiedAsNode, valueType);
            } catch (IOException | JsonPatchException ex) {
            //throw new JaqpotSerializationException(ex);
            throw null;
            }
        }
}
*/