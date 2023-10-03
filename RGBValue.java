package Arrays;
/*
* char *RGBorder(char *c_a, int num)
{
    int middle = 0;  // assume we only want the middle element
    int low = 0;     // before the G's
    int high = num - 1;  // after the G's

    while (middle <= high)
    {
        if (c_a[middle] == 'R')  // if we see an 'R' in the middle, it needs to go before the middle
        {
            std::swap(c_a[middle], c_a[low]);  // swap it to a place before middle
            ++middle;  // middle has creeped up one spot
            ++low;     // so has the point where we will swap when we do this again
        }
        else
            if (c_a[middle] == 'B')  // if we see a 'B' as the middle element, it needs to go after the middle
            {
                std::swap(c_a[middle], c_a[high]); // place it as far back as you can
                --high;  // decrease the back position for next swap that comes here
            }
            else
                ++middle;  // it is a 'G', do nothing
    }
    return c_a;
}
*
* */
public class RGBValue {
}
