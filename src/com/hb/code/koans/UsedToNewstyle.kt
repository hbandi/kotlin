package com.hb.code.koans

/**
 *
 * Rewrite the following Java function to Kotlin.

public Collection<String> doSomethingStrangeWithCollection(
Collection<String> collection
) {
Map<Integer, List<String>> groupsByLength = Maps.newHashMap();
for (String s : collection) {
List<String> strings = groupsByLength.get(s.length());
if (strings == null) {
strings = Lists.newArrayList();
groupsByLength.put(s.length(), strings);
}
strings.add(s);
}

int maximumSizeOfGroup = 0;
for (List<String> group : groupsByLength.values()) {
if (group.size() > maximumSizeOfGroup) {
maximumSizeOfGroup = group.size();
}
}

for (List<String> group : groupsByLength.values()) {
if (group.size() == maximumSizeOfGroup) {
return group;
}
}
return null;
}
 **/

fun doSomeThingStrangeWithCollection(collection: Collection<String>): List<String>? {
    val groupByLength: Map<Int, List<String>> = collection.groupBy { it.length }
    val maximumSizeOfGroup = groupByLength.values.map { it.size }.max()
    return groupByLength.values.firstOrNull { grp -> grp.size == maximumSizeOfGroup }
}