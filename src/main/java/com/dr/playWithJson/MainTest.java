package com.dr.playWithJson;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainTest {
    public static void main(String[] args) throws Exception{

        String jsonstr0 = "{\"alarmDetails\":{\"conditionDetails\":{\"alarmId\":7,\"alarmNodataNotifyTime\":1,\"alarmNowSeriesWaitTime\":2},\"conditionStatic\":{\"alarmId\":7,\"conditionAggregate\":\"avg\",\"conditionOperator\":1,\"conditionThresholdTime\":5,\"conditionThresholdValue\":\"123\"},\"metricDetails\":{\"alarmId\":7,\"metricAggregater\":\"avg\",\"metricBy\":\"host\",\"metricExcludeTag\":\"host:paas-177\",\"metricName\":\"system.cpu.user\",\"metricQ\":\"avg:system.cpu.user{#address:wuhan,!host:paas-177}by{host}\",\"metricTag\":\"#address:wuhan\"},\"notify\":[{\"alarmId\":7,\"notifyChannel\":5,\"notifyUserId\":1},{\"alarmId\":7,\"notifyChannel\":5,\"notifyUserId\":2}],\"view\":{\"alarmExpression\":\"avg(last_5m)avg:system.cpu.user{#address:wuhan,!host:paas-177}by{host}>123.0\",\"alarmId\":7,\"alarmLastValue\":\"UP\",\"alarmName\":\"static_metric\",\"alarmStatus\":1,\"alarmType\":2,\"alarmTypeJoin\":3,\"createTime\":\"2017-06-28 17:25:52.0\",\"createUserId\":1,\"isDisable\":false,\"lastAlarmTime\":\"2017-06-28 17:25:27.0\",\"metricName\":\"system.cpu.user\",\"metricTag\":\"#address:wuhan\",\"updateTime\":\"2017-06-29 15:49:18.0\"}},\"alarmId\":7,\"allMark\":{\"avg:system.cpu.user{host:cfeng-4,#address:wuhan,!host:paas-177}\":{\"changePutTime\":true,\"lastPutTsdbTime\":1499655343,\"lastSuccessCheckTime\":1499655349,\"series\":\"avg:system.cpu.user{host:cfeng-4,#address:wuhan,!host:paas-177}\",\"tagMap\":{\"host\":\"cfeng-4\",\"#address\":\"wuhan\",\"!host\":\"paas-177\"}}},\"joinType\":3,\"useMetricUnit\":\"percent\",\"validataDetails\":{\"status\":0,\"validataMerges\":[{\"alarmMarkDto\":{\"changePutTime\":true,\"lastPutTsdbTime\":1499655343,\"lastSuccessCheckTime\":1499655349,\"series\":\"avg:system.cpu.user{host:cfeng-4,#address:wuhan,!host:paas-177}\",\"tagMap\":{\"host\":\"cfeng-4\",\"#address\":\"wuhan\",\"!host\":\"paas-177\"}},\"status\":0,\"tag\":\"host:cfeng-4\",\"validataNodata\":{\"currentTime\":1499655349,\"isNodata\":false,\"lastSuccessCheckTime\":1499655349,\"series\":\"avg:system.cpu.user{host:cfeng-4,#address:wuhan,!host:paas-177}\",\"tag\":{\"host\":\"cfeng-4\",\"#address\":\"wuhan\",\"!host\":\"paas-177\"},\"thresholdTime\":60},\"validataStatic\":{\"converToThresholdValue\":123.0,\"end\":1499655343,\"intervalAggregator\":\"avg\",\"isAlart\":true,\"operator\":1,\"series\":\"avg:system.cpu.user{host:cfeng-4,#address:wuhan,!host:paas-177}\",\"start\":1499655043,\"sysUnit\":\"percent\",\"tag\":{\"#address\":\"wuhan\",\"host\":\"cfeng-4\",\"!host\":\"paas-177\"},\"thresholdTime\":300,\"thresholdValue\":\"123\",\"value\":5.715769243240357}}],\"validataTimeSeconds\":1499655349}}";
        String jsonstr1 = "{\"alarmDetails\":{\"conditionDetails\":{\"alarmId\":7,\"alarmNodataNotifyTime\":1,\"alarmNowSeriesWaitTime\":2},\"conditionStatic\":{\"alarmId\":7,\"conditionAggregate\":\"avg\",\"conditionOperator\":1,\"conditionThresholdTime\":5,\"conditionThresholdValue\":\"123\"},\"metricDetails\":{\"alarmId\":7,\"metricAggregater\":\"avg\",\"metricBy\":\"host\",\"metricExcludeTag\":\"host:paas-177\",\"metricName\":\"system.cpu.user\",\"metricQ\":\"avg:system.cpu.user{#address:wuhan,!host:paas-177}by{host}\",\"metricTag\":\"#address:wuhan\"},\"notify\":[{\"alarmId\":7,\"notifyChannel\":5,\"notifyUserId\":1},{\"alarmId\":7,\"notifyChannel\":5,\"notifyUserId\":2}],\"view\":{\"alarmExpression\":\"avg(last_5m)avg:system.cpu.user{#address:wuhan,!host:paas-177}by{host}>123.0\",\"alarmId\":7,\"alarmLastValue\":\"UP\",\"alarmName\":\"static_metric\",\"alarmStatus\":1,\"alarmType\":2,\"alarmTypeJoin\":3,\"createTime\":\"2017-06-28 17:25:52.0\",\"createUserId\":1,\"isDisable\":false,\"lastAlarmTime\":\"2017-06-28 17:25:27.0\",\"metricName\":\"system.cpu.user\",\"metricTag\":\"#address:wuhan\",\"updateTime\":\"2017-06-29 15:49:18.0\"}},\"alarmId\":7,\"allMark\":{\"avg:system.cpu.user{host:cfeng-4,#address:wuhan,!host:paas-177}\":{\"changePutTime\":true,\"lastPutTsdbTime\":1499655374,\"lastSuccessCheckTime\":1499655379,\"series\":\"avg:system.cpu.user{host:cfeng-4,#address:wuhan,!host:paas-177}\",\"tagMap\":{\"host\":\"cfeng-4\",\"#address\":\"wuhan\",\"!host\":\"paas-177\"}}},\"joinType\":3,\"useMetricUnit\":\"percent\",\"validataDetails\":{\"status\":0,\"validataMerges\":[{\"alarmMarkDto\":{\"changePutTime\":true,\"lastPutTsdbTime\":1499655374,\"lastSuccessCheckTime\":1499655379,\"series\":\"avg:system.cpu.user{host:cfeng-4,#address:wuhan,!host:paas-177}\",\"tagMap\":{\"host\":\"cfeng-4\",\"#address\":\"wuhan\",\"!host\":\"paas-177\"}},\"status\":0,\"tag\":\"host:cfeng-4\",\"validataNodata\":{\"currentTime\":1499655379,\"isNodata\":false,\"lastSuccessCheckTime\":1499655379,\"series\":\"avg:system.cpu.user{host:cfeng-4,#address:wuhan,!host:paas-177}\",\"tag\":{\"host\":\"cfeng-4\",\"#address\":\"wuhan\",\"!host\":\"paas-177\"},\"thresholdTime\":60},\"validataStatic\":{\"converToThresholdValue\":123.0,\"end\":1499655374,\"intervalAggregator\":\"avg\",\"isAlart\":true,\"operator\":1,\"series\":\"avg:system.cpu.user{host:cfeng-4,#address:wuhan,!host:paas-177}\",\"start\":1499655074,\"sysUnit\":\"percent\",\"tag\":{\"#address\":\"wuhan\",\"host\":\"cfeng-4\",\"!host\":\"paas-177\"},\"thresholdTime\":300,\"thresholdValue\":\"123\",\"value\":5.089640821729388}}],\"validataTimeSeconds\":1499655379}}";

        Set<String> set = new HashSet<String>();

        set.add(jsonstr0);
        set.add(jsonstr1);


        Gson gs = new Gson();

        List<Object> eventList = new ArrayList<Object>();

        for (String str : set) {

            JsonObject returnData = new JsonParser().parse(str).getAsJsonObject();
            JsonObject ad = returnData.get("alarmDetails").getAsJsonObject();
            JsonObject vd = returnData.get("validataDetails").getAsJsonObject();
            JsonArray vm = vd.get("validataMerges").getAsJsonArray();
            JsonArray nf = ad.get("notify").getAsJsonArray();
            JsonObject v = ad.get("view").getAsJsonObject();
            String validataTimeSeconds = vd.get("validataTimeSeconds").toString();

            for (JsonElement je : vm) {
                je.getAsJsonObject().add("view", v);
                je.getAsJsonObject().add("notify", nf);
                je.getAsJsonObject().addProperty("validataTimeSeconds", Long.parseLong(validataTimeSeconds));

                eventList.add(je);
            }
        }

        for (Object obj : eventList) {
            String inParam = gs.toJson(obj);
            System.out.println(inParam);
        }

        //System.out.println(gs.toJson(eventList));
    }
}
