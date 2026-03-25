class Solution {
    public int longestSubstring(String s, int k) {
        return fun(s, k);
    }

    private int fun(String s, int k) {
        if (s.length() == 0) return 0;

        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] < k) {
                int left = fun(s.substring(0, i), k);
                int right = fun(s.substring(i + 1), k);
                return Math.max(left, right);
            }
        }

        return s.length(); 
    }
}


















































// clc;
// clear all;

// % Read the image
// img = imread('MATLAB Drive\Lena-kept-image2.png');
// imshow(img);

// % Convert image to vector
// img_vector = img(:);

// % Get unique symbols and their probabilities
// symbols = unique(img_vector);
// prob = histcounts(img_vector, numel(symbols), 'Normalization', 'probability');

// % Create Huffman dictionary
// dict = huffmandict(symbols, prob);

// % Encode and decode using Huffman coding
// img_encoded = huffmanenco(img_vector, dict);
// img_decoded = huffmandeco(img_encoded, dict);

// % Reconstruct image
// img_reconstructed = uint8(img_decoded);
// imshow(img_reconstructed);

// % Calculate compression statistics
// original_bits = numel(img_vector) * 8;
// compressed_bits = numel(img_encoded);
// compression_ratio = original_bits / compressed_bits;

// fprintf('Original Size: %d bits\n', original_bits);
// fprintf('Compressed Size: %d bits\n', compressed_bits);
// fprintf('Compression Ratio: %f\n', compression_ratio);

// % Display original and reconstructed images side by side
// figure;
// subplot(1,2,1); imshow(img); title('Original Image');
// subplot(1,2,2); imshow(img_reconstructed); title('Reconstructed Image');

// % Plot pixel probability distribution
// figure;
// bar(symbols, prob, 'Marker', 'none');
// title('Pixel Probability Distribution');
// xlabel('Intensity Value');
// ylabel('Probability');













// % Define intensity levels
// high = 255;
// low = 75;
// strong = 255;
// weak = 75;

// % Apply double thresholding
// result(result > high) = strong;
// result(result > low & result <= high) = weak;
// result(result <= low) = 0;

// figure, imshow(uint8(result));
// title('Double Thresholding');

// % Edge tracking by hysteresis
// for i = 2:m-1
//     for j = 2:n-1
//         if result(i,j) == weak
//             if any(result(i-1:i+1, j-1:j+1) == strong)
//                 result(i,j) = strong;
//             else
//                 result(i,j) = 0;
//             end
//         end
//     end
// end

// % Final edge map
// Edge1 = result == strong;
// figure, imshow(Edge1);
// title('Canny Edge Detected Image');