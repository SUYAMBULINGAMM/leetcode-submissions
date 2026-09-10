class Solution {
    public String kthDistinct(String[] arr, int k) {
        return Arrays.stream(arr).filter(s->Arrays.stream(arr).collect(Collectors.groupingBy(e->e,Collectors.counting())).get(s)==1).skip(k-1).findFirst().orElse("");
        
    }
}