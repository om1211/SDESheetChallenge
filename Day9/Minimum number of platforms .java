	Arrays.sort(arr);
    	Arrays.sort(dep);
    	int i=1;
    	int j=0;
    	int pt=1;
    	int res=0;
    	while(i<n && j<n){
    	    if(arr[i]>dep[j]){
    	        pt++;
    	        i++;
    	    }
    	    else if(arr[i]<dep[j])
    	    {
    	        pt--;
    	        j++;
    	    }
    	    if(pt>res){
    	        res=pt;
    	    }
    	}
    	return res;
