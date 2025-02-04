import java.util.Scanner;
public class iselse {
    public static void main(String[] ar ){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        // switch (a) {
        //     case 1:
        //         System.out.println("Sunday");
        //         break;
        //     case 2:
        //         System.out.println("Monday");
        //         break;
        //     default:
        //         System.out.println("oliday");
        //         break;
        // }
        if (a<=100){
            if(a<35){
                System.out.println("Grade is E");
            }
            else if((a>=35)&&(a<51)){
                System.out.println("Grade is D");
            }
            else if((a>=51)&&(a<=60)){
                System.out.println("Grade is c");
            }
            else if((a>=61)&&(a<71)){
                System.out.println("Grade is C+");
            }
            else if((a>=71)&&(a<81)){
                System.out.println("Grade is B");
            }
            else if((a>=81)&&(a<91)){
                System.out.println("Grade is B+");
            }
            else if((a>=91)&&(a<96)){
                System.out.println("Grade is A");
            }
            else if((a>=96)&&(a<101)){
                System.out.println("Grade is A+");
            }
            else{
                System.out.println("Number sould be +");
            }
        }
        else{
            System.out.println("less tan 100");
        }
    }
}


// 1. In the context of image generation using diffusion models, what is the fundamental role of supervised learning?
//    c. To learn from noisy images and generate cleaner versions.

// 2. What challenge arises when relying on Large Language Models (LLMs) for medical advice, and how can it be mitigated?
//    b. LLMs tend to exaggerate medical conditions, and cross-referencing with authoritative sources is advised.

// 3. What is the key difference between supervised and unsupervised machine learning models?
//    a. Supervised models use labeled data, while unsupervised models do not.

// 4. In the context of generative AI, what is a pre-trained model?
//    b. A model pre-trained on a vast amount of data, adaptable to various tasks.

// 5. What is the role of transformers in generative AI?
//    c. They encode and decode input sequences for tasks like natural language processing.

// 6. What is the main purpose of the PaLSM API in Generative AI?
//    b. Testing and experimenting with large language models.

// 7. How is GPT different from a search engine in terms of context?
//    c. GPT considers context and generates responses accordingly.

// 8. What is a similarity between GPT and a search engine in terms of user interaction?
//    a. Both make decisions based on generated text.